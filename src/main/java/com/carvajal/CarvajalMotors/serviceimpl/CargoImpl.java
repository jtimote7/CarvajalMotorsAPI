package com.carvajal.CarvajalMotors.serviceimpl;

import com.carvajal.CarvajalMotors.dao.ICargoDao;
import com.carvajal.CarvajalMotors.entities.CargoEntity;
import com.carvajal.CarvajalMotors.service.CargoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoImpl implements CargoService {
    @Autowired
    private ICargoDao cargoDao;

    @Override
    @Transactional
    public ResponseEntity<CargoEntity> saveCargo(CargoEntity cargo) {
        return new ResponseEntity<>(cargoDao.save(cargo), HttpStatus.OK);
    }

    @Override
    public List<CargoEntity> cargos() {
        return cargoDao.findAll();
    }
}
