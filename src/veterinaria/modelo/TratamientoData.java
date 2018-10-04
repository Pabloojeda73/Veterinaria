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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PabloOjeda
 */
public class TratamientoData {
    private Connection connection = null;
    
    public TratamientoData (Conexion conexion) {
        try {
            connection = conexion.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarTratamiento(Tratamiento tratamiento) {
        String sql = "INSERT INTO Tratamientos (tipo, importe, descripcion, activo) VALUES ( ? , ? , ? , ? );";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, tratamiento.getTipo());
            statement.setDouble(2, tratamiento.getImporte());
            statement.setString(3, tratamiento.getDescripcion());
            statement.setBoolean(4, tratamiento.isActivo());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if(rs.next()) {
                tratamiento.setId(rs.getInt("id"));
            } else {
                System.out.println("No se pudo obtener el id del tratamiento creado.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    //main para probar y borrar
    public static void main(String[] args) throws ClassNotFoundException {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
        TratamientoData tratamientoData = new TratamientoData(conexion);
        
        /*Tratamiento tratamiento = new Tratamiento();
        tratamiento.setActivo(true);
        tratamiento.setDescripcion("Para la castración constatar que la mascota tenga más de 1 año.");
        tratamiento.setImporte(375.2);
        tratamiento.setTipo("Castracion");
        
        tratamientoData.guardarTratamiento(tratamiento);
        System.out.println("El id del nuevo tratamiento es: " + tratamiento.getId());*/
        
        
    }
    
    
}
