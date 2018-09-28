/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author PabloOjeda
 */
public class Cliente {
    private int id;
    private int dni;
    private String apellidoNombre;
    private String direccion;
    private int telefono;
    private String unContacto;
    //RE VEER EL TEMA DE MASCOTA
    private Mascota mascota;

    public Cliente(int id, int dni, String apellidoNombre, String direccion, int telefono, String unContacto) {
        this.id = id;
        this.dni = dni;
        this.apellidoNombre = apellidoNombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.unContacto = unContacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUnContacto() {
        return unContacto;
    }

    public void setUnContacto(String unContacto) {
        this.unContacto = unContacto;
    }
    
    
    
}
