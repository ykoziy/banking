package com.ykz.banking.service;

import com.ykz.banking.exception.UserNotFoundException;
import com.ykz.banking.model.User;
import com.ykz.banking.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getById(Long id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found"));
    }
}
