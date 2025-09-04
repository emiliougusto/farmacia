package com.farmacia.Emilio.controller;


import com.farmacia.Emilio.dto.FuncionarioDto;
import com.farmacia.Emilio.model.FuncionarioModel;
import com.farmacia.Emilio.repository.FuncionarioRepository;
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
@RequestMapping("/api/v1/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar(@RequestBody @Valid
                                                       FuncionarioDto funcionarioDto) {

        var FuncionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, FuncionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioRepository.save(FuncionarioModel));
    }
    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> getAllFuncionarios() {
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioRepository.findAll());
    }

    @GetMapping("/{idFuncionario}")
            public ResponseEntity<Object> getFuncionario(@PathVariable("idFuncionario")Integer idFuncionario) {
        Optional<FuncionarioModel> funcionario0 = funcionarioRepository.findById(idFuncionario);
        if (funcionario0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(funcionario0.get());
    }
}
