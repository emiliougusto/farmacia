package com.farmacia.Emilio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmacia.Emilio.model.ProdutosModel;
import java.util.Optional;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Integer> {
    Optional<ProdutosModel> findByCdProduto(int cdProduto);

    Optional<ProdutosModel> findByCdProduto(Integer cdProduto);

}
