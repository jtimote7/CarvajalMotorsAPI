package com.carvajal.CarvajalMotors.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="mercanciatbl")
public class MercanciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto")
    private int idproducto;
    @Column(name="nombreproducto")
    private String nombreproducto;
    @Column(name="fechaingreso")
    private Date fechaingreso;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="usuarioregistro")
    private int usuarioregistro;
    @Column(name="usuariomod")
    private String usuariomod;
    @Column(name="fechamod")
    private String fechamod;

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
