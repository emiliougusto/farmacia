package com.farmacia.Emilio.controller;


import com.farmacia.Emilio.dto.EmpresaDto;
import com.farmacia.Emilio.model.EmpresaModel;
import com.farmacia.Emilio.repository.EmpresaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/empresa")


public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @PostMapping
    public ResponseEntity<EmpresaModel> salvar(@RequestBody @Valid
                                               EmpresaDto empresaDto) {
        var empresaModel = new EmpresaModel();
        BeanUtils.copyProperties(empresaDto, empresaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaRepository.save(empresaModel));
    }

    @GetMapping
    public ResponseEntity<List<EmpresaModel>> gettAllEmpresas() {
        return ResponseEntity.status(HttpStatus.OK).body(empresaRepository.findAll());
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Object> getEmpresa(@PathVariable("idEmpresa") Integer idEmpresa) {
        Optional <EmpresaModel>empresa0 = empresaRepository.findById(idEmpresa);
        if (empresa0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empresa inexistente");
        }
        return ResponseEntity.status(HttpStatus.OK).body(empresa0.get());
    }

}
