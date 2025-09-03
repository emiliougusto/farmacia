package com.farmacia.Emilio.repository;

import com.farmacia.Emilio.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
    Optional<ClienteModel> findByidCliente(int idCliente);

    Optional<ClienteModel> findAllByIdCliente(Integer idCliente);
}
