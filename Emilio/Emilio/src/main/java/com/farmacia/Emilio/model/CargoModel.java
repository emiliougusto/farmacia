package com.farmacia.Emilio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "TBCARGO")
public class CargoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCargo;
    @Column(name ="NMCARGO")
    private String nmCargo;
}
