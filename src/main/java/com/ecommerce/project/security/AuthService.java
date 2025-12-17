package com.ecommerce.project.security;

import com.ecommerce.project.payload.AuthenticationResult;
import com.ecommerce.project.security.request.LoginRequest;

public interface AuthService {
    AuthenticationResult login(LoginRequest loginRequest);
}
