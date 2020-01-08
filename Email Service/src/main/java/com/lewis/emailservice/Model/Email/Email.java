package com.lewis.emailservice.Model.Email;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Lewis.Aguh on 11/10/2019
 */

public class Email {
    @NotNull
    public String name;
    @NotNull
    @Min(10)
    public String body;
    @NotNull
    public List<String> setTo;
    public String subject;
    public List<String> bcc;
    public List<String> cc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getSetTo() {
        return setTo;
    }

    public void setSetTo(List<String> setTo) {
        this.setTo = setTo;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
