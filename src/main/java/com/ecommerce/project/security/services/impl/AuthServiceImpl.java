package com.ecommerce.project.security.services.impl;

import com.ecommerce.project.payload.AuthenticationResult;
import com.ecommerce.project.security.AuthService;
import com.ecommerce.project.security.request.LoginRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthenticationResult login(LoginRequest loginRequest) {
        return null;
    }
}
