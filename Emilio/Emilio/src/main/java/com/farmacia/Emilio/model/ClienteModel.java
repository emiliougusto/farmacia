package com.farmacia.Emilio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "TBCLIENTE")
public class ClienteModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idCliente;
    @Column(name = "NMCLIENTE")
    private String nmCliente;
    @Pattern(regexp = "\\d{11}")
    private String cpfCliente;
    @Pattern(regexp = "\\d{11}")
    private String telCliente;
    @Column(name = "EMAILCLIENTE")
    @Email private String emailCliente;


}
