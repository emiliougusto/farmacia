package com.farmacia.Emilio.repository;

import com.farmacia.Emilio.model.CargoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CargoRepository extends JpaRepository<CargoModel, Integer> {

    Optional<CargoModel> findByIdCargo(Integer idCargo);

    Optional<CargoModel> findAllByIdCargo(Integer idCargo);
}
