package de.adesso.jamesjarvis.auth.service;

import de.adesso.jamesjarvis.auth.dto.LoginRequest;
import de.adesso.jamesjarvis.auth.dto.LoginResponse;
import de.adesso.jamesjarvis.auth.dto.RegisterRequest;

public interface AuthService {

    LoginResponse login(LoginRequest request);

    LoginResponse register(RegisterRequest request);

    LoginResponse refreshToken(String refreshToken);
}
