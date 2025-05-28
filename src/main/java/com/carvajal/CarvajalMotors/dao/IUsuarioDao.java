package com.carvajal.CarvajalMotors.dao;

import com.carvajal.CarvajalMotors.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioDao extends JpaRepository<UsuarioEntity, Long> {
}
