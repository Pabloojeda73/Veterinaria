/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

<<<<<<< HEAD
=======
import java.time.LocalDate;
import java.util.Date;

>>>>>>> e6309a9693f8d6f78a06bba54f7196746cf3aad5
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
<<<<<<< HEAD
    private String colorDePelo;
    private String fecNac;
=======
    private String colorPelo;
    private LocalDate FecNac;
    
    //me parece que habria que sacarlas de aca porque estos 
    //datos los vamos a tener guardados en la base de datos
>>>>>>> e6309a9693f8d6f78a06bba54f7196746cf3aad5
    private boolean vacunado;
    private boolean enfermo;
    private boolean herido;
    private boolean bañadoPeinado;
    private boolean castrado;
<<<<<<< HEAD
    private double pesoMedio;
    private double pesoActual;

    public Mascota(int id, int id_duenio, String alias, String sexo, String especie, String raza, String colorPelo, String fecNac, double pesoMedio, double pesoActual) {
=======
    private double pesoPromedio10Visitas;
    
    
    private double pesoMedio;

    public Mascota(int id, Cliente duenio, String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fecNac, double pesoUltima10Visitas, double pesoActual) {
>>>>>>> e6309a9693f8d6f78a06bba54f7196746cf3aad5
        this.id = id;
        this.duenio =duenio; //agregado(pablo)
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
<<<<<<< HEAD
        this.colorDePelo = colorPelo;
        this.fecNac = fecNac;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
=======
        this.colorPelo = colorPelo;
        this.FecNac = fecNac;
        this.pesoPromedio10Visitas = pesoUltima10Visitas;
        this.pesoMedio = pesoActual;
>>>>>>> e6309a9693f8d6f78a06bba54f7196746cf3aad5
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

<<<<<<< HEAD
    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
=======
    public LocalDate getFecNac() {
        return FecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.FecNac = fecNac;
>>>>>>> e6309a9693f8d6f78a06bba54f7196746cf3aad5
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setpesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
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
