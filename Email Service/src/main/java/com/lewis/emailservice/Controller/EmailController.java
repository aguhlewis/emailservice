package com.lewis.emailservice.Controller;

import com.lewis.emailservice.Model.Email.Email;
import com.lewis.emailservice.Model.Exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.bind.ValidationException;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Lewis.Aguh on 06/08/2019
 */

@RestController
@RequestMapping(value = "/api/v1/emailservice")
public class EmailController {

    @Autowired
    private com.lewis.emailservice.Model.Email.EmailConfig emailConfig;

    @RequestMapping(value = "/send", method = RequestMethod.POST )
    public void sendFeedback(
            @RequestBody Email email,
            BindingResult bindingResult
    ) throws ValidationException, MessagingException {
        if(bindingResult.hasErrors()) {
            throw new ValidationException("Email is not valid");
        }

        if(email.getSetTo().size() == 0)
            throw new BadRequestException("400", "Email recipient(s) can not be empty or null");

        if(email.getBody().isEmpty())
            throw new BadRequestException("400", "Email body can not be empty or null");

        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", this.emailConfig.getHost());
        properties.put("mail.smtp.port", this.emailConfig.getPort());
        properties.put("mail.smtp.auth", "true");

        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        properties.put("mail.smtp.quitwait", "false");


        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.user", this.emailConfig.getUsername());

        // creates a new session, no Authenticator (will connect() later)
        Session session = Session.getDefaultInstance(properties);

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(this.emailConfig.getUsername()));

        String toEmail = "";
        String bccAddresses = "";
        String ccAddresses = "";

        if(email.setTo != null) {
            for(String toemail: email.getSetTo()) {
                toEmail += toemail + " ,";
            }
        }
        msg.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(toEmail));

        if(email.getBcc() != null) {
            for(String bcc: email.getBcc()) {
                bccAddresses += bcc + " ,";
            }
        }
        msg.addRecipients(Message.RecipientType.BCC,
                InternetAddress.parse(bccAddresses));

        if(email.getCc() != null) {
            for(String cc: email.getCc()) {
                bccAddresses += cc + " ,";
            }
        }
        msg.addRecipients(Message.RecipientType.CC,
                InternetAddress.parse(ccAddresses));

        msg.setSubject(email.getSubject());
        msg.setSentDate(new Date());
        // set plain text message
        msg.setText(email.getBody());


        // sends the e-mail
        Transport t = session.getTransport("smtp");
        t.connect(this.emailConfig.getUsername(), this.emailConfig.getPassword());
        t.sendMessage(msg, msg.getAllRecipients());
        t.close();
    }

}
