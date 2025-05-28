package com.carvajal.CarvajalMotors.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Usuariotbl")
public class UsuarioEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private int IDUsuario;
    @Column(name="nombre")
    private String Nombre;
    @Column(name="edad")
    private String Edad;
    @Column(name="cargo")
    private int Cargo;
    @Column(name="fecha_ingreso")
    private Date FechaIngreso;

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public int getCargo() {
        return Cargo;
    }

    public void setCargo(int cargo) {
        Cargo = cargo;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }
}
