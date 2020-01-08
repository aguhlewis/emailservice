// package com.lewis.critics.Security;
//
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.stereotype.Component;
//
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.IOException;
// import java.io.Serializable;
//
// /**
//  * Created by Lewis.Aguh on 08/08/2019
//  */
//
// @Component
// public class AuthenticationEntryPoint implements org.springframework.security.web.AuthenticationEntryPoint, Serializable {
//     private static final long serialVersionUID = -7858869558953243875L;
//     @Override
//     public void commence(HttpServletRequest request, HttpServletResponse response,
//                          AuthenticationException authException) throws IOException {
//         response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
//     }
// }
