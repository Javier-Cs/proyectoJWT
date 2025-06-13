package com.example.ejemploSecurity.config;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private static final String SECRET_KEY = "a66e8cb9491371963a265001ce2f09935811ec0b8592edd6cdc2c7e9d99ceb73";

    public String getUserName(String token) {
        return getClaim(token, Claims::getSubject);
    }
}
