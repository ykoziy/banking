package com.ykz.banking.controller;

import com.ykz.banking.model.User;
import com.ykz.banking.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "{userId}")
    public ResponseEntity<User> getByUserId(@PathVariable("userId") Long userId) {
        User user = userService.getById(userId);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
    }

}
