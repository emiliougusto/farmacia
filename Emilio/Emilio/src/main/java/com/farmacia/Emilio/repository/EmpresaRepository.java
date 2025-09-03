package com.farmacia.Emilio.repository;

import com.farmacia.Emilio.model.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, Integer> {

    Optional<EmpresaModel> findByIdEmpresa(Integer idEmpresa);

    Optional<EmpresaModel> findAllByIdEmpresa(Integer idEmpresa);
}
