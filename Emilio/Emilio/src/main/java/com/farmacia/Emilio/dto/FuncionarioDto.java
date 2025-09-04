package com.farmacia.Emilio.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto(
        @NotBlank(message = "Não tem funcionarios sem nome")
        String nmFuncionario,
        @NotBlank(message = "Não é possivel ter um funcionario sem cpf")
        String cpfFuncionario,
        @NotBlank(message = "Não é possivel ter um Funcionario sem telefone")
        String telFuncionario,
        @NotBlank(message = "Não é possivel ter um funcionario sem Email")
        String emailFuncionario,
        @NotNull(message = "Não é possivel deixar um funcionario sem sálario")
        @DecimalMin(value = "1514", message = "Não pode deixar alguem com salario menor que 1514")
        Double salFuncionario,
        @NotBlank(message = "Não é possivel ter um funcionario sem cargo")
        String cargo

) {
}
