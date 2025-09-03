package com.farmacia.Emilio.dto;

import jakarta.validation.constraints.NotBlank;

public record FuncionarioDto(
        @NotBlank(message = "Não tem funcionarios sem nome")
        String nmFuncionario,
        @NotBlank(message = "Não é possivel ter um funcionario sem cpf")
        String cpfFuncionario,
        @NotBlank(message = "Não é possivel ter um Funcionario sem telefone")
        String telFuncionario,
        @NotBlank(message = "Não é possivel ter um funcionario sem Email")
        String emailFuncionario,
        @NotBlank(message = "Não é possivel deixar um funcionario sem sálario")
        double salarioFuncionario,
        @NotBlank(message = "Não é possivel ter um funcionario sem cargo")
        String cargo

) {
}
