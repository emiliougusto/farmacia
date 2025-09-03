package com.farmacia.Emilio.controller;

import com.farmacia.Emilio.dto.ClienteDto;
import com.farmacia.Emilio.model.ClienteModel;
import com.farmacia.Emilio.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/cliente")

public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<ClienteModel> salvar(@RequestBody  @Valid
                                                   ClienteDto clienteDto) {
        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteDto, clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));
    }
    @GetMapping
    public ResponseEntity<List<ClienteModel>> getAllClientes() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }
    @GetMapping("/{idCliente}")
    public ResponseEntity<Object> getCliente(@PathVariable("idCliente") Integer idCliente) {
        Optional<ClienteModel> cliente0 = clienteRepository.findById(idCliente);

        if(cliente0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }
            return ResponseEntity.status(HttpStatus.OK).body(cliente0);
    }
}
