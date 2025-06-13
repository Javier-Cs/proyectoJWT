package com.example.ejemploSecurity.Service;

import com.example.ejemploSecurity.Entity.Role;
import com.example.ejemploSecurity.Entity.User;
import com.example.ejemploSecurity.Model.AuthResponse;
import com.example.ejemploSecurity.Model.AuthenticationRequest;
import com.example.ejemploSecurity.Model.ReguisterRequest;
import com.example.ejemploSecurity.config.JwtService;
import com.example.ejemploSecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService  jwtService;

    @Override
    public AuthResponse register(ReguisterRequest request) {
        var user = User.builder()
                .username(request.getUsername())
                .lastNameUser(request.getLastNameUser())
                .emailUser(request.getEmailUser())
                .passwordUser(passwordEncoder.encode(request.getPasswordUser()))
                .role(Role.USER).build();
        userRepository.save(user);

        var jwtToken = jwtService.generarToken(user);
        return AuthResponse.builder().token(jwtToken).build();
    }

    @Override
    public AuthResponse Authentication(AuthenticationRequest request) {
        return null;
    }
}
