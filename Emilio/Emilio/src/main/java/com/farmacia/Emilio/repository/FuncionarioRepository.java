package com.farmacia.Emilio.repository;

import com.farmacia.Emilio.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {
    Optional<FuncionarioModel> findByIdFuncionario(int idFuncionario);
    Optional<FuncionarioModel> findAllByIdFuncionario(Integer idFuncionario);
}
