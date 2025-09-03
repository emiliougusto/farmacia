package com.farmacia.Emilio.dto;

import jakarta.validation.constraints.NotBlank;

public record ClienteDto (
    @NotBlank(message = "Não é possivel salvar um Cliente sem nome")
    String nmCliente,
    @NotBlank(message = "Não é possivel por um CPF com menos que 11 digitos")
    String cpfCliente,
    @NotBlank(message = "Não é possivel por este numero de telefone")
    String telCliente,
    @NotBlank(message = "Não é possivel salvar um Email sem nada")
    String emailCliente

)
{}