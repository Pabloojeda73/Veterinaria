/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;

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
    private LocalDate fecNac;
    private boolean vacunado;
    private boolean enfermo;
    private boolean herido;
    private boolean bañadoPeinado;
    private boolean castrado;
    //VER EL TEMA DEL ARRAYLIST SI ASI ESTA BIEN O CONSTRUIRLO(poner aca si se corrigio o no)
    private ArrayList pesoPromedio10Visitas;
    private String pesoActual;

    public Mascota(int id, String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fecNac, ArrayList pesoUltima10Visitas, String pesoActual) {
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

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public ArrayList getPesoUltima10Visitas() {
        return pesoPromedio10Visitas;
    }

    public void setPesoUltima10Visitas(ArrayList pesoUltima10Visitas) {
        this.pesoPromedio10Visitas = pesoUltima10Visitas;
    }

    public String getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(String pesoActual) {
        this.pesoActual = pesoActual;
    }
    
    
    
}
