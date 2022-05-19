package com.example.registrationmvc.service;

import com.example.registrationmvc.model.User;
import com.example.registrationmvc.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);


}
