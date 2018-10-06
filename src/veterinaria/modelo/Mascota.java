/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

import java.time.LocalDate;
import java.util.Date;

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
    private String colorPelo;
    private LocalDate FecNac;
    
    //me parece que habria que sacarlas de aca porque estos 
    //datos los vamos a tener guardados en la base de datos
    private boolean vacunado;
    private boolean enfermo;
    private boolean herido;
    private boolean bañadoPeinado;
    private boolean castrado;
    private double pesoPromedio10Visitas;
    
    
    private double pesoMedio;

    public Mascota(int id, Cliente duenio, String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fecNac, double pesoUltima10Visitas, double pesoActual) {
        this.id = id;
        this.duenio =duenio; //agregado(pablo)
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.FecNac = fecNac;
        this.pesoPromedio10Visitas = pesoUltima10Visitas;
        this.pesoMedio = pesoActual;
    }

    public Mascota() {
        
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
        return FecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.FecNac = fecNac;
    }

    public double getPesoUltima10Visitas() {
        return pesoPromedio10Visitas;
    }

    public void setPesoUltima10Visitas(double pesoUltima10Visitas) {
        this.pesoPromedio10Visitas = pesoUltima10Visitas;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public boolean isEnfermo() {
        return enfermo;
    }

    public void setEnfermo(boolean enfermo) {
        this.enfermo = enfermo;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean isBañadoPeinado() {
        return bañadoPeinado;
    }

    public void setBañadoPeinado(boolean bañadoPeinado) {
        this.bañadoPeinado = bañadoPeinado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public double getPesoPromedio10Visitas() {
        return pesoPromedio10Visitas;
    }

    public void setPesoPromedio10Visitas(double pesoPromedio10Visitas) {
        this.pesoPromedio10Visitas = pesoPromedio10Visitas;
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getActivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    
}
