package com.carvajal.CarvajalMotors.dao;

import com.carvajal.CarvajalMotors.entities.MercanciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMercanciaDao extends JpaRepository<MercanciaEntity, Long> {
    public int deleteByIDProductoAndUsuarioRegistro(int id, int usuarioRegistro);
}
