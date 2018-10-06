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

/**
 *
 * @author PabloOjeda
 */
public class MascotaData {
    
    private Connection connection = null;

    public MascotaData(Conexion conexion) {
        connection = conexion.getConexion();
    }
    
    
    public void guardarMAscota(Mascota mascota){
        try {
            
            String sql = "INSERT INTO alumno (alias, sexo, especie, raza, colorDePelo, fecNac, pesoMedio, pesoActual) VALUES ( ? , ? , ? , ?, ?, ?, ?, ?);";

            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, mascota.getAlias());
                statement.setString(2, mascota.getSexo());
                statement.setString(3, mascota.getEspecie());
                statement.setString(4, mascota.getRaza());
                statement.setString(5, mascota.getColorDePelo());
                statement.setString(6, mascota.getFecNac());
                statement.setDouble(7, mascota.getPesoMedio());
                statement.setDouble(8, mascota.getPesoActual());
                
                statement.executeUpdate();
                
                ResultSet rs = statement.getGeneratedKeys();
                
                if (rs.next()) {
                    mascota.setId(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una mascota.");
                }
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mascota: " + ex.getMessage());
        }
    }
    
    public List<Mascota> obtenerMascota(){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM mascotas;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota();
                mascota.setId(resultSet.getInt("id"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setFecNac(resultSet.getString("FecNac"));

                mascotas.add(mascota);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        List<Mascota> mascota;
        
        
        return mascotas;
  }
}