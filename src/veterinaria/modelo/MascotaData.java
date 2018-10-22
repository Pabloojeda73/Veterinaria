/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

import java.sql.Connection;
import java.sql.Date;
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
public class MascotaData {
    
    private Connection connection = null;
    private ClienteData clienteData;

    public MascotaData(Conexion conexion) {
        try {
            connection = conexion.getConnection();
            clienteData = new ClienteData(conexion);
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void guardarMascota(Mascota mascota){
        String sql = "INSERT INTO Mascotas "
                + "(alias, sexo, especie, raza, colorDePelo, fecNac, pesoMedio, id_cliente) "
                + "VALUES ( ? , ?, ?, ?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
                System.out.println("sql: " + sql);
                statement.setString(1, mascota.getAlias());
                statement.setString(2, mascota.getSexo());
                statement.setString(3, mascota.getEspecie());
                statement.setString(4, mascota.getRaza());
                statement.setString(5, mascota.getColorDePelo());
                statement.setDate(6, Date.valueOf(mascota.getFecNac()));
                statement.setDouble(7, mascota.getPesoMedio());
                statement.setInt(8, mascota.getDuenio().getId());
                
                statement.executeUpdate();
                
                ResultSet rs = statement.getGeneratedKeys();
                
                if (rs.next()) {
                    mascota.setId(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una mascota.");
                }
                statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Mascota> obtenerMascotas(){
        ArrayList<Mascota> mascotas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM Mascotas;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota();
                mascota.setId(resultSet.getInt("id"));
                mascota.setDuenio(clienteData.obtenerCliente(resultSet.getInt("id_cliente")));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColorDePelo(resultSet.getString("colorDePelo"));
                mascota.setFecNac(resultSet.getDate("FecNac").toLocalDate());
                mascota.setPesoMedio(resultSet.getDouble("pesoMedio"));

                mascotas.add(mascota);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        return mascotas;
  }
    
    public Mascota obtenerMascota(int id) {
        Mascota mascota = null;
        
        String sql = "SELECT * FROM Mascotas WHERE id = ? ;";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()) {
                mascota = new Mascota();
                mascota.setAlias(rs.getString("alias"));
                mascota.setColorDePelo(rs.getString("colorDePelo"));
                mascota.setDuenio(clienteData.obtenerCliente(rs.getInt("id_cliente")));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setFecNac(rs.getDate("fecNac").toLocalDate());
                mascota.setId(rs.getInt("id"));
                mascota.setPesoMedio(rs.getDouble("pesoMedio"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setSexo(rs.getString("sexo"));
                
            }
            
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mascota;
    }
    
    public void actualizarMascota(Mascota mascota) {
        String sql = "UPDATE Mascotas "
                + "SET alias = ? , sexo = ? , especie = ? , raza = ? , "
                + "colorDePelo = ? , fecNac = ? , pesoMedio = ?"
                + "WHERE id = ? ;";
        
        System.out.println(mascota.getAlias());
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, mascota.getAlias());
            statement.setString(2, mascota.getSexo());
            statement.setString(3, mascota.getEspecie());
            statement.setString(4, mascota.getRaza());
            statement.setString(5, mascota.getColorDePelo());
            statement.setDate(6, Date.valueOf(mascota.getFecNac()));
            statement.setDouble(7, mascota.getPesoMedio());
            statement.setInt(8, mascota.getId());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}