package com.farmacia.Emilio.dto;

import org.hibernate.validator.constraints.NotBlank;

public record EmpresaDto(
        @NotBlank(message = "A empresa não pode ficar sem nome")
        String nmEmpresa,
        @NotBlank(message = "A empresa precisa ter CNPJ")
        String cnpjEmpresa,
        @NotBlank(message = "A empresa precisa ter um numero de telefone")
        String telEmpresa,
        @NotBlank(message = "A empresa precisa ter um endereço")
        String enderecoEmpresa,
        @NotBlank(message = "A empresa precisa ter um EMAIL")
        String Email
) {
}
