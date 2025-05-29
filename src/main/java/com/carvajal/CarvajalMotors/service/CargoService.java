package com.carvajal.CarvajalMotors.service;

import com.carvajal.CarvajalMotors.dto.MercanciaDTO;
import com.carvajal.CarvajalMotors.entities.CargoEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CargoService {

    public ResponseEntity<CargoEntity> saveCargo(CargoEntity cargo);
    public List<CargoEntity> cargos();
}
