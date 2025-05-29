package com.carvajal.CarvajalMotors.serviceimpl;

import com.carvajal.CarvajalMotors.dao.IMercanciaDao;
import com.carvajal.CarvajalMotors.dto.MercanciaDTO;
import com.carvajal.CarvajalMotors.dto.UsuarioDTO;
import com.carvajal.CarvajalMotors.entities.MercanciaEntity;
import com.carvajal.CarvajalMotors.service.MercanciaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MercanciaImpl implements MercanciaService {
    @Autowired
    private IMercanciaDao mercanciaDao;
    @Override
    public List<MercanciaDTO> listarMercancia() {
        return mercanciaDao.findAll()
                .stream()
                .map(merc ->{
                    return new MercanciaDTO(merc.getIdproducto(),merc.getNombreproducto(), merc.getFechaingreso(), merc.getCantidad(), merc.getUsuarioregistro(), merc.getUsuariomod(), merc.getFechamod());
                }).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public ResponseEntity<?> saveMercancia(MercanciaDTO mercanciaDTO) {
        MercanciaEntity mercanciaEntity= new MercanciaEntity();
        mercanciaEntity.setCantidad(mercanciaDTO.getCantidad());
        mercanciaEntity.setFechaingreso(mercanciaDTO.getFechaingreso());
        mercanciaEntity.setIdproducto(mercanciaDTO.getIdproducto());
        mercanciaEntity.setUsuarioregistro(mercanciaDTO.getUsuarioregistro());
        mercanciaEntity.setNombreproducto(mercanciaDTO.getNombreproducto());
        mercanciaEntity.setFechamod(mercanciaDTO.getFechamod());
        mercanciaEntity.setUsuariomod(mercanciaDTO.getUsuariomod());

        return new ResponseEntity<>(mercanciaDao.save(mercanciaEntity), HttpStatus.CREATED);
    }

    @Override
    @Transactional
    public ResponseEntity<?> delete(int idproducto, int usuarioregistro) {
        int filasElminadas= mercanciaDao.deleteByIdproductoAndUsuarioregistro(idproducto, usuarioregistro);
        if(filasElminadas > 0){
            return new ResponseEntity<>("Eliminado", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("No eliminado", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> update(MercanciaDTO mercanciaDTO) {
        MercanciaEntity mercanciaEntity= new MercanciaEntity();
        mercanciaEntity.setCantidad(mercanciaDTO.getCantidad());
        mercanciaEntity.setFechaingreso(mercanciaDTO.getFechaingreso());
        mercanciaEntity.setIdproducto(mercanciaDTO.getIdproducto());
        mercanciaEntity.setUsuarioregistro(mercanciaDTO.getUsuarioregistro());
        mercanciaEntity.setNombreproducto(mercanciaDTO.getNombreproducto());
        return new ResponseEntity<>(mercanciaDao.save(mercanciaEntity),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> buscarById(long merchantId) {
        return new ResponseEntity<>(mercanciaDao.findById(merchantId), HttpStatus.OK);
    }
}
