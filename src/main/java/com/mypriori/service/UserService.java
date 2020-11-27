package com.mypriori.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mypriori.model.User;
import com.mypriori.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
