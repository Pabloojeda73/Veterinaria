/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

import java.util.List;

/**
 *
 * @author PabloOjeda
 */
public class Cliente {
    private int id = -1;
    private String dni;
    private String apellidoNombre;
    private String direccion;
    private String telefono;
    private String unContacto;
    
    private List<Mascota> mascotas;
    
    public Cliente() {
        this.id = -1;
    }

    public Cliente(int id, String dni, String apellidoNombre, String direccion, String telefono, String unContacto) {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUnContacto() {
        return unContacto;
    }

    public void setUnContacto(String unContacto) {
        this.unContacto = unContacto;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    
    @Override
    public String toString() {
        return apellidoNombre;
    }
}
