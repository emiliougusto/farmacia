package com.farmacia.Emilio.dto;

import jakarta.validation.constraints.NotBlank;

public record CargoDto(
        @NotBlank(message = "não é possivel um cargo sem nome")
        String nmCargo
) {
}
