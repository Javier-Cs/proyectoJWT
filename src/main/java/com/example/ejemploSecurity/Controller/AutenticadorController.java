package com.example.ejemploSecurity.Controller;

import com.example.ejemploSecurity.Model.AuthResponse;
import com.example.ejemploSecurity.Model.AuthenticationRequest;
import com.example.ejemploSecurity.Model.ReguisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AutenticadorController {

    @PostMapping("/registrar")
    public ResponseEntity<AuthResponse> registrar(@RequestBody ReguisterRequest request){
        return ResponseEntity.ok(authService.register(request));
    }

    public ResponseEntity<AuthResponse> autenticacion(@RequestBody AuthenticationRequest authRequest){
        return  ResponseEntity.ok(authService.authenticate(authRequest));

    }

}
