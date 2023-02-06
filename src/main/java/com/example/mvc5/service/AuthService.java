package com.example.mvc5.service;

import com.example.mvc5.payload.LoginDto;
import com.example.mvc5.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
