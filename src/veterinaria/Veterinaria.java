/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import veterinaria.modelo.Cliente;
import veterinaria.modelo.ClienteData;
import veterinaria.modelo.Conexion;

/**
 *
 * @author PabloOjeda
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        ClienteData clienteData = new ClienteData(conexion);
        
        Cliente cliente = new Cliente();
        cliente.setApellidoNombre("Garcia, Carla");
        cliente.setDireccion("Bolivar 11111");
        cliente.setDni("11111111");
        cliente.setTelefono("2664111111");
        cliente.setUnContacto("Rodriguez, Ernesto");
                
        clienteData.guardarCliente(cliente);
        System.out.println(cliente.getId());
    }
    
}
