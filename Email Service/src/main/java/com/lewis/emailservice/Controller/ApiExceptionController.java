//package com.lewis.emailservice.Controller;
//
//import com.lewis.emailservice.Model.Exception.BadRequestException;
//import com.lewis.emailservice.Model.Exception.NotFoundException;
//import com.lewis.emailservice.Model.Exception.ExceptionResponse;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
///**
// * Created by Lewis.Aguh on 10/08/2019
// */
//
//@ResponseBody
//@ControllerAdvice(annotations = RestController.class, basePackages = "com.lewis.emailservice")
//public class ApiExceptionController {
//
//    private static final Logger logger = LoggerFactory.getLogger(ApiExceptionController.class);
////    @Autowired
////    classprivate GenericExceptionNotifierService genericExceptionNotifierService;
//
//
//    @ExceptionHandler(BadRequestException.class)
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ExceptionResponse handleNotFoundException(BadRequestException e) {
//        ExceptionResponse response = new ExceptionResponse();
//        response.setCode(e.getCode());
//        response.setDescription(e.getMessage());
//        return response;
//    }
//
////    @ExceptionHandler(Exception.class)
////    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
////    @ResponseBody
////    public ExceptionResponse handleException(Exception e) {
////        try {
////            genericExceptionNotifierService.exceptionNotifier(e);
////        } catch (Exception e1) {
////            // TODO Auto-generated catch block
////            e1.printStackTrace();
////        }
////        ExceptionResponse response = new ExceptionResponse();
////        response.setCode("9999");
////        response.setDescription("An error occurred while processing your request. Please contact server administrator for more details");
////        e.printStackTrace();
////        return response;
////    }
//
//    @ExceptionHandler(NotFoundException.class)
//    @ResponseStatus(value = HttpStatus.NOT_FOUND)
//    @ResponseBody
//    public ExceptionResponse handleNotFoundException(NotFoundException e) {
//        ExceptionResponse response = new ExceptionResponse();
//        response.setCode(e.getCode());
//        response.setDescription(e.getMessage());
//        return response;
//    }
//
//}
