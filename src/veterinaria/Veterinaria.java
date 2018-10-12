/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.ArrayList;
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
        System.out.println("El id del nuevo cliente es: " + cliente.getId());
        
        ArrayList<Cliente> clientes = (ArrayList)clienteData.obtenerClientes();
        for(Cliente c:clientes) {
            System.out.println("Cliente " + c.toString());
        }
        
        cliente.setDireccion("Bolivar 2222");
        cliente.setDni("222222");
        clienteData.actualizarCliente(cliente);
        Cliente clienteAcutalizado = clienteData.obtenerCliente(cliente.getId());
        System.out.println("Cliente actualizado: Direccion " + cliente.getDireccion() + " DNI: " + cliente.getDni());
        
        clienteData.borrarCliente(cliente.getId());
        clientes = (ArrayList)clienteData.obtenerClientes();
        for(Cliente c:clientes) {
            System.out.println(c.toString());
        }
    }
}
