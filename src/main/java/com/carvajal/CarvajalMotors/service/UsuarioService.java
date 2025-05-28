package com.carvajal.CarvajalMotors.service;

import com.carvajal.CarvajalMotors.dto.UsuarioDTO;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioService {
    public List<UsuarioDTO> listarUsuarios();
    public ResponseEntity<?> saveUsuario(UsuarioDTO usuarioDTO);
}
