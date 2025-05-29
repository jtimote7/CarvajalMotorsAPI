package com.carvajal.CarvajalMotors.dao;

import com.carvajal.CarvajalMotors.entities.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICargoDao extends JpaRepository<CargoEntity,Long> {

}
