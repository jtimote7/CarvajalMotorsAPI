package com.carvajal.CarvajalMotors.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="mercanciatbl")
public class MercanciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto")
    private int IDProducto;
    @Column(name="nombreproducto")
    private String NombreProducto;
    @Column(name="fechaingreso")
    private Date FechaIngreso;
    @Column(name="cantidad")
    private int Cantidad;
    @Column(name="usuarioregistro")
    private int usuarioRegistro;

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public int getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(int usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }
}
