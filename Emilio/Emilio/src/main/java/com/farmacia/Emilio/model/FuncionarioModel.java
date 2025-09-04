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

@Entity(name = "TBFUNCIONARIO")
public class FuncionarioModel {
    /*
     * criar uma API de funcionario
     * id do funcionario
     * nome do funcionario
     * cpf do funcionario
     * telefone do funcionario
     * Salario do funcionario
     * cargo do funcionario
     * codigo do cargo do funcionario
     */
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncionario;
    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionario;
    @Pattern(regexp = "\\d{11}")
    private String cpfFuncionario;
    @Pattern(regexp = "\\d{11}")
    private String telFuncionario;
    @Column(name ="EMAILFUNCIONARIO")
    @Email private String emailFuncionario;
    @Column(name = "SALFUNCIONARIO")
    private double salFuncionario;
    @Column(name= "CARGOFUNCIONARIO")
    private String cargo;
    @Column(name= "CDCARGOFUNCIONARIO")
    private Integer cdCargoFuncionario;

}
