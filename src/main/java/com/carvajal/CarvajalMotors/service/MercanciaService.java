package com.carvajal.CarvajalMotors.service;

import com.carvajal.CarvajalMotors.dao.IMercanciaDao;
import com.carvajal.CarvajalMotors.dto.MercanciaDTO;
import com.carvajal.CarvajalMotors.dto.UsuarioDTO;
import com.carvajal.CarvajalMotors.entities.MercanciaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MercanciaService {
    public List<MercanciaDTO> listarMercancia();
    public ResponseEntity<?> saveMercancia(MercanciaDTO mercanciaDTO);
    public ResponseEntity<?> delete(int idproducto, int usuarioregistro);
    public ResponseEntity<?>update(MercanciaDTO mercanciaDTO);
    public ResponseEntity<?> buscarById(long merchantId);
}
