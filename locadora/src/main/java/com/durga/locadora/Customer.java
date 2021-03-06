package com.durga.locadora;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private String cpf;
}
