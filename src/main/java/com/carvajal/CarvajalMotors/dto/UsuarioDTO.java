package com.carvajal.CarvajalMotors.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@JsonPropertyOrder
public class UsuarioDTO implements Serializable {
    private int idusuario;
    private String nombre;
    private String edad;
    private int cargo;
    private Date fechaIngreso;

    public UsuarioDTO(int idusuario, String nombre, String edad, int cargo, Date fechaIngreso) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
