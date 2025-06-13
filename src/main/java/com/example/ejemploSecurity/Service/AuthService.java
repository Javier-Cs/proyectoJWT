package com.example.ejemploSecurity.Service;

import com.example.ejemploSecurity.Model.AuthResponse;
import com.example.ejemploSecurity.Model.AuthenticationRequest;
import com.example.ejemploSecurity.Model.ReguisterRequest;


public interface AuthService {

    AuthResponse register(ReguisterRequest request);

    AuthResponse Authentication(AuthenticationRequest request);
}
