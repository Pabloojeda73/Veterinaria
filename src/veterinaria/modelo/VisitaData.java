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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nachomorati
 */
public class VisitaData {
    private Connection connection = null;
    private MascotaData mascotaData;
    private TratamientoData tratamientoData;

    public VisitaData(Conexion conexion) {
        try {
            connection = conexion.getConnection();
            mascotaData = new MascotaData(conexion);
            tratamientoData = new TratamientoData(conexion);
            
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarVisita(Visita visita) {
        String sql = "INSERT INTO Visitas (id_mascota, id_tratamiento, veterinario, fecha, pesoActual, detalles)"
                + "VALUES (? , ? , ? , ? , ? , ?);";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, visita.getMascota().getId());
            statement.setInt(2, visita.getTratamiento().getId());
            statement.setString(3, visita.getVeterinario());
            statement.setDate(4, Date.valueOf(visita.getFecha()));
            statement.setDouble(5, visita.getPesoActual());
            statement.setString(6, visita.getDetalles());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if(rs.next()) {
                visita.setId(rs.getInt("id"));
            } else {
                System.out.println("No se pudo obtener el id de la visita");
            }
            
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Visita> obtenerVisitas() {
        ArrayList<Visita> visitas = new ArrayList<>();
        String sql = "SELECT * FROM Visitas;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            Visita visita;
            while(rs.next()) {
                visita = new Visita();
                visita.setDetalles(rs.getString("detalles"));
                visita.setFecha(rs.getDate("fecha").toLocalDate());
                visita.setId(rs.getInt("id"));
                visita.setMascota(mascotaData.obtenerMascota(rs.getInt("id_mascota")));
                visita.setPesoActual(rs.getDouble("pesoActual"));
                visita.setTratamiento(tratamientoData.obtenerTratamiento(rs.getInt("id_tratamiento")));
                visita.setVeterinario(rs.getString("veterinario"));
                
                visitas.add(visita);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return visitas;
    }
    
}
