/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PabloOjeda
 */
public class ClienteData {

    private Connection connection = null;
    
    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO Clientes(dni, apellidoNombre, direccion, telefono, unContacto) "
                + "VALUES ( ? , ? , ? , ? , ? );";
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getDni());
            statement.setString(2, cliente.getApellidoNombre());
            statement.setString(3, cliente.getDireccion());
            statement.setString(4, cliente.getTelefono());
            statement.setString(5, cliente.getUnContacto());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if (rs.next()) {
                cliente.setId(rs.getInt("id"));
            } else {
                System.out.println("No se pudo obtener el id luego de guardar al cliente.");
            }
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> obtenerClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        String sql = "SELECT * FROM Clientes;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            Cliente cliente;
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setDni(rs.getString("dni"));
                cliente.setApellidoNombre(rs.getString("apellidoNombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setUnContacto(rs.getString("unContacto"));
                
                clientes.add(cliente);
            }
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clientes;
    }
    
    public Cliente obtenerCliente(int id) {
        Cliente cliente = null;
        try {
            String sql = "SELECT * FROM Clientes WHERE id = ? ;";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setApellidoNombre(rs.getString("apellidoNombre"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setDni(rs.getString("dni"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setUnContacto(rs.getString("unContacto"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
        
    public void borrarCliente(int id) {
        String sql = "DELETE FROM Clientes WHERE id = ? ;";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            
            statement.executeUpdate();
            statement.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar un cliente." + ex.getMessage());
        }
    }
    
    public void actualizarCliente (Cliente cliente) {
        try {
            String sql = "UPDATE Clientes SET apellidoNombre = ? , dni = ? , "
                    + "direccion = ? , telefono = ? , unContacto = ? WHERE id = ? ";
            
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getApellidoNombre());
            statement.setString(2, cliente.getDni());
            statement.setString(3, cliente.getDireccion());
            statement.setString(4, cliente.getTelefono());
            statement.setString(5, cliente.getUnContacto());
            statement.setInt(6, cliente.getId());
            
            statement.executeUpdate();
            statement.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el Cliente. " + ex.getMessage());
        }
    }

}
