/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

import java.util.Date;

/**
 *
 * @author PabloOjeda
 */
public class Mascota {
    private int id;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelo;
    private Date fecNac;
    private boolean vacunado;
    private boolean enfermo;
    private boolean herido;
    private boolean bañadoPeinado;
    private boolean castrado;
    private double pesoPromedio10Visitas;
    private double pesoActual;

    public Mascota(int id, String alias, String sexo, String especie, String raza, String colorPelo, Date fecNac, double pesoUltima10Visitas, double pesoActual) {
        this.id = id;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fecNac = fecNac;
        this.pesoPromedio10Visitas = pesoUltima10Visitas;
        this.pesoActual = pesoActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public double getPesoUltima10Visitas() {
        return pesoPromedio10Visitas;
    }

    public void setPesoUltima10Visitas(double pesoUltima10Visitas) {
        this.pesoPromedio10Visitas = pesoUltima10Visitas;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    
 
    
}
