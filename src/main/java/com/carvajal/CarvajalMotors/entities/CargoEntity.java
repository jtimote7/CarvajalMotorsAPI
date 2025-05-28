package com.carvajal.CarvajalMotors.entities;

import jakarta.persistence.*;

@Entity
@Table(name="cargotbl")
public class CargoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcargo")
    private int IDCargo;
    @Column(name="nombrecargo")
    private String NombreCargo;

    public int getIDCargo() {
        return IDCargo;
    }

    public void setIDCargo(int IDCargo) {
        this.IDCargo = IDCargo;
    }

    public String getNombreCargo() {
        return NombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        NombreCargo = nombreCargo;
    }
}
