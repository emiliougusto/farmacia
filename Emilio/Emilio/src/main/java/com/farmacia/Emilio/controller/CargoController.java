package com.farmacia.Emilio.controller;

import com.farmacia.Emilio.dto.CargoDto;
import com.farmacia.Emilio.model.CargoModel;
import com.farmacia.Emilio.repository.CargoRepository;
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
@RequestMapping("/api/v1/Cargo")


public class CargoController {
    @Autowired

    private CargoRepository cargoRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<CargoModel> salvarCargo(@RequestBody @Valid
                                                  CargoDto cargoDto) {
        var cargoModel = new CargoModel();
        BeanUtils.copyProperties(cargoDto, cargoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoRepository.save(cargoModel));
    }

    @GetMapping
    public ResponseEntity<List<CargoModel>> getAllCargo() {
        return ResponseEntity.status(HttpStatus.OK).body(cargoRepository.findAll());
    }

    @GetMapping("/{idCargo}")
    public ResponseEntity<Object> getCargo(@PathVariable("idCargo") Integer idCargo) {
        Optional<CargoModel> cargo0 = cargoRepository.findById(idCargo);
        if (cargo0.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cargo não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cargo0);
    }
}
