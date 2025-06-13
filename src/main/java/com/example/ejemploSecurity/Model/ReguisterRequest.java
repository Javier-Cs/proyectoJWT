package com.example.ejemploSecurity.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReguisterRequest {
    private int id;
    private String username;
    private String lastNameUser;
    private String emailUser;
    private String passwordUser;
}
