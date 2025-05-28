package com.carvajal.CarvajalMotors.serviceimpl;

import com.carvajal.CarvajalMotors.dao.IUsuarioDao;
import com.carvajal.CarvajalMotors.dto.UsuarioDTO;
import com.carvajal.CarvajalMotors.entities.UsuarioEntity;
import com.carvajal.CarvajalMotors.service.UsuarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioImpl implements UsuarioService {

    @Autowired
    private IUsuarioDao userRepository;

    @Override
    public List<UsuarioDTO> listarUsuarios() {
        return userRepository.findAll()
                .stream()
                .map(usu -> {
                    return new UsuarioDTO(usu.getIDUsuario(), usu.getNombre(),  usu.getEdad(), usu.getCargo(), usu.getFechaIngreso());
                })
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public ResponseEntity<?> saveUsuario(UsuarioDTO usuarioDTO) {
        System.out.println("nombre "+usuarioDTO.getNombre());
        UsuarioEntity user= new UsuarioEntity();
        user.setIDUsuario(0);
        user.setNombre(usuarioDTO.getNombre());
        user.setCargo(usuarioDTO.getCargo());
        user.setEdad(usuarioDTO.getEdad());
        user.setFechaIngreso(new Date());
        return new ResponseEntity<UsuarioEntity>(userRepository.save(user), HttpStatus.CREATED);
    }


}
