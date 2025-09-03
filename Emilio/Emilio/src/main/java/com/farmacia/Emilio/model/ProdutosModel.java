package com.farmacia.Emilio.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "TBPRODUTOS")
public class ProdutosModel {
  @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CDPRODUTO")
    private Integer cdProduto;
  @Column(name = "NMPRODUTO")
    private String nmProduto;
  @Column(name="DSBULA")
    private String dsBula;
    @Column(name ="VLPRODUTO")
        double vlProduto;
}
