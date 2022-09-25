package com.ykz.banking.controller;

import com.ykz.banking.exception.UserNotFoundException;
import com.ykz.banking.model.User;
import com.ykz.banking.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "{userId}")
    public User getByUserId(@PathVariable("userId") Long userId) {
        try {
            return userService.getById(userId);
        } catch (UserNotFoundException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage(), ex);
        }

    }

}
