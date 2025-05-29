package com.carvajal.CarvajalMotors.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Cargotbl")
public class CargoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcargo")
    private int idcargo;
    @Column(name="nombrecargo")
    private String nombrecargo;

    public int getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    public String getNombreCargo() {
        return nombrecargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombrecargo = nombreCargo;
    }
}
