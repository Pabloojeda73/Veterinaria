/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author PabloOjeda
 */
public class Mascota {
    private int id;
    private Cliente duenio;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorDePelo;
    private LocalDate FecNac;
    private double pesoMedio;
    
    //me parece que habria que sacarlas de aca porque estos 
    //datos los vamos a tener guardados en la base de datos
    /*private boolean vacunado;
    private boolean enfermo;
    private boolean herido;
    private boolean bañadoPeinado;
    private boolean castrado;*/
    

    public Mascota(int id, Cliente duenio, String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fecNac, double pesoMedio) {
        this.id = id;
        this.duenio =duenio; //agregado(pablo)
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorDePelo = colorPelo;
        this.FecNac = fecNac;
        this.pesoMedio = pesoMedio;
    }

    public Mascota() {
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
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

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public LocalDate getFecNac() {
        return FecNac;
    }

    public void setFecNac(LocalDate FecNac) {
        this.FecNac = FecNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }
    
}
