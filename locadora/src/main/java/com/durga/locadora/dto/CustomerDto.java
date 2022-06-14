package com.durga.locadora.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDto {

    private Long id;
    private String name;
    private Long cpf;
}
