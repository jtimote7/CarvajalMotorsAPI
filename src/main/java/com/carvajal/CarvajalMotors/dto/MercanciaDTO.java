package com.carvajal.CarvajalMotors.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@JsonPropertyOrder
public class MercanciaDTO implements Serializable {
    private int idproducto;
    private String nombreproducto;
    private Date fechaingreso;
    private int cantidad;
    private int usuarioregistro;
    private String usuariomod;
    private String fechamod;

    public MercanciaDTO(int idproducto, String nombreproducto, Date fechaingreso, int cantidad, int usuarioregistro, String usuariomod, String fechamod) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.fechaingreso = fechaingreso;
        this.cantidad = cantidad;
        this.usuarioregistro = usuarioregistro;
        this.usuariomod = usuariomod;
        this.fechamod = fechamod;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getUsuarioregistro() {
        return usuarioregistro;
    }

    public void setUsuarioregistro(int usuarioregistro) {
        this.usuarioregistro = usuarioregistro;
    }

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod;
    }

    public String getFechamod() {
        return fechamod;
    }

    public void setFechamod(String fechamod) {
        this.fechamod = fechamod;
    }
}
