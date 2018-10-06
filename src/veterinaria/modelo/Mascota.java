/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

/**
 *
 * @author PabloOjeda
 */
public class Mascota {
    private int id;
    //para que funcione el metodo que agregué en ClienteData de buscarMascotas por cliente
    //habría que agregar un atributo "Cliente duenio" con su getter y setter.
    private int id_duenio; //agregado(pablo)
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorDePelo;
    private String fecNac;
    private boolean vacunado;
    private boolean enfermo;
    private boolean herido;
    private boolean bañadoPeinado;
    private boolean castrado;
    private double pesoMedio;
    private double pesoActual;

    public Mascota(int id, int id_duenio, String alias, String sexo, String especie, String raza, String colorPelo, String fecNac, double pesoMedio, double pesoActual) {
        this.id = id;
        this.id_duenio =id_duenio; //agregado(pablo)
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorDePelo = colorPelo;
        this.fecNac = fecNac;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
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

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorDePelo = colorPelo;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setpesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
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

    

    public void setPesoPromedio10Visitas(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getActivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPesoMedio(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
        
}
