// package com.lewis.critics.Controller;
//
// import com.lewis.critics.Model.Exception.BadRequestException;
// import com.lewis.critics.Model.User;
// import com.lewis.critics.Security.Request;
// import com.lewis.critics.Security.Response;
// import com.lewis.critics.Service.UserService;
// import com.lewis.critics.Security.TokenUtil;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.BadCredentialsException;
// import org.springframework.security.authentication.DisabledException;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.validation.annotation.Validated;
// import org.springframework.web.bind.annotation.*;
//
// /**
//  * Created by Lewis.Aguh on 08/08/2019
//  */
//
// @RestController
// @CrossOrigin
// @RequestMapping(value = "/api/v1/critics")
// public class LoginController {
//
//     @Autowired
//     private AuthenticationManager authenticationManager;
//
//     @Autowired
//     private TokenUtil jwtTokenUtil;
//
//     @Autowired
//     private UserService userService;
//
//
//     @RequestMapping(value = "/login", method = RequestMethod.POST)
//     public ResponseEntity<?> login(@RequestBody Request request) throws Exception {
//         if (request.getUsername() == null || request.getUsername().isEmpty() || request.getUsername().trim().isEmpty())
//             throw new BadRequestException("400", "Username cannot be empty");
//
//         if (request.getPassword() == null || request.getPassword().isEmpty())
//             throw new BadRequestException("400", "Password cannot be empty");
//
//         authenticate(request.getUsername(), request.getPassword());
//
//         final UserDetails userDetails = userService.loadUserByUsername(request.getUsername());
//
//         final String token = jwtTokenUtil.generateToken(userDetails);
//
//         return ResponseEntity.ok(new Response(token));
//     }
//
//     @RequestMapping(value = "/signup", method = RequestMethod.POST)
//     public ResponseEntity<?> signup(@RequestBody @Validated User user) throws Exception {
//         User result = userService.createUser(user);
//         authenticate(result.getUsername(), result.getPassword());
//
//         final UserDetails userDetails = userService.loadUserByUsername(result.getUsername());
//
//         final String token = jwtTokenUtil.generateToken(userDetails);
//
//         return ResponseEntity.ok(new Response(token));
//
//     }
//
//     private void authenticate(String username, String password) throws Exception {
//         try {
//             authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//         } catch (DisabledException e) {
//             throw new Exception("USER_DISABLED", e);
//         } catch (BadCredentialsException e) {
//             throw new Exception("INVALID CREDENTIALS", e);
//         }
//     }
// }
