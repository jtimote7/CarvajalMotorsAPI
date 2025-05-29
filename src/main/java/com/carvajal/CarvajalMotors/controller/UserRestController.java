package com.carvajal.CarvajalMotors.controller;

import com.carvajal.CarvajalMotors.dto.MercanciaDTO;
import com.carvajal.CarvajalMotors.dto.UsuarioDTO;
import com.carvajal.CarvajalMotors.entities.CargoEntity;
import com.carvajal.CarvajalMotors.entities.MercanciaEntity;
import com.carvajal.CarvajalMotors.service.CargoService;
import com.carvajal.CarvajalMotors.service.MercanciaService;
import com.carvajal.CarvajalMotors.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motors")
@CrossOrigin("*")
public class UserRestController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private MercanciaService mercanciaService;
    @Autowired
    private CargoService cargoService;

    @PostMapping("/saveUser")
    public ResponseEntity<?> saveUsuario(@RequestBody UsuarioDTO user){
        return usuarioService.saveUsuario(user);
    }

    @GetMapping("/users")
    public List<UsuarioDTO> getUsers(){
        return usuarioService.listarUsuarios();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteMerchant(@Param("idproducto") int idproducto, @Param("usuarioregistro") int usuarioregistro){
        return mercanciaService.delete(idproducto, usuarioregistro);
    }

    @PostMapping("/saveMerc")
    public ResponseEntity<?> saveMerc(@RequestBody MercanciaDTO mercanciaDTO){
        return mercanciaService.saveMercancia(mercanciaDTO);
    }

    @GetMapping("/merchants")
    public List<MercanciaDTO> getMerchants(){
        return mercanciaService.listarMercancia();
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody MercanciaDTO mercanciaDTO){
        return mercanciaService.update(mercanciaDTO);
    }

    @GetMapping("/buscarById")
    public ResponseEntity<?> buscarById(@RequestParam("id") long id){
        return mercanciaService.buscarById(id);
    }

    @PostMapping("/savecargo")
    public ResponseEntity<?> saveCargo(@RequestBody CargoEntity cargo){
        return cargoService.saveCargo(cargo);
    }

    @GetMapping("/cargos")
    public List<CargoEntity> cargos(){
        return cargoService.cargos();
    }
}
