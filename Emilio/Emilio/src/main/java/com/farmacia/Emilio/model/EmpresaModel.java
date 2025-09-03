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

@Entity(name = "TBEMPRESA")
public class EmpresaModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpresa;
    @Column(name = "NMEMPRESA")
    private String nmEmpresa;
    @Column(name = "CNPJEMPRESA")
    private String cnpjEmpresa;
    @Pattern(regexp = "\\d{11}")
    private String telEmpresa;
    @Column(name="ENDERECOEMPRESA")
    private String enderecoEmpresa;
    @Column(name = "EMAILEMPRESA")
    @Email private String emailEmpresa;
}
