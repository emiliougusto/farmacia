package com.farmacia.Emilio.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto(

        @NotBlank(message = "Não é possivel salvar o produto sem nome!")
        String nmProduto,
        @NotBlank(message = "Não é possivel salvar o produto sem descrição!")
        String dsBula,
        @NotNull(message = "Não é possivel salvar o produto sem preço!")
        @DecimalMin(value = "0.01", message = "O valor do produto deve ser maior que 0.01.")
        double vlProduto
) {}
