package com.ykz.banking.controller;

import com.ykz.banking.dto.CustomerDTO;
import com.ykz.banking.exception.UserException;
import com.ykz.banking.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/customer/reg")
    public void registerCustomer(@RequestBody CustomerDTO customer) {
        try {
            authService.registerCustomer(customer);
        } catch (UserException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
}
