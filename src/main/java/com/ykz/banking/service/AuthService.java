package com.ykz.banking.service;

import com.ykz.banking.dto.CustomerDTO;
import com.ykz.banking.exception.UserException;
import com.ykz.banking.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AuthService {
    private final UserService userService;
    private final ModelMapper mapper;

    public AuthService(UserService userService, ModelMapper mapper) {
        this.mapper = mapper;
        this.userService = userService;
    }

    @Transactional
    public void registerCustomer(CustomerDTO userDto) throws UserException {
        Optional<User> userOptional = userService.getByEmail(userDto.getEmail());
        if (userOptional.isPresent()) {
            throw new UserException("email taken");
        }
        userOptional = userService.getByUsername(userDto.getUsername());
        if (userOptional.isPresent()) {
            throw new UserException("username taken");
        }
        User newUser = mapper.map(userDto, User.class);
        userService.save(newUser);
    }
}
