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
import java.time.LocalDate;
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
        String sql = "INSERT INTO Mascotas (id_cliente, alias, sexo, especie, raza, colorDePelo, fecNac, pesoMedio) VALUES ( ? , ? , ?, ?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
                statement.setInt(1, mascota.getDuenio().getId());
                statement.setString(2, mascota.getAlias());
                statement.setString(3, mascota.getSexo());
                statement.setString(4, mascota.getEspecie());
                statement.setString(5, mascota.getRaza());
                statement.setString(6, mascota.getColorDePelo());
                statement.setDate(7, Date.valueOf(mascota.getFecNac()));
                statement.setDouble(8, mascota.getPesoMedio());
                
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
        List<Mascota> mascotas = new ArrayList<>();
            

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
        //List<Mascota> mascota;
        
        
        return mascotas;
  }
    
    public static void main(String[] args) {
        try {
            Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
            
            Mascota mascota = new Mascota();
            mascota.setAlias("simona");
            mascota.setSexo("Hembra");
            mascota.setEspecie("Perro");
            mascota.setRaza("Cañon");
            mascota.setColorDePelo("Negro");
            mascota.setFecNac(LocalDate.of(2014, 3, 15));
            mascota.setPesoMedio(35.8);
            mascota.setPesoActual(38.7);

            MascotaData mascotaData = new MascotaData(conexion);
            
            ArrayList<Mascota> mascotas = (ArrayList)mascotaData.obtenerMascotas();
            
            System.out.println("Mascotas " + mascotas);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}