
package gob.ar.itse.JuegoDeLadrillo.dao.ranking;
import gob.ar.itse.JuegoDeLadrillo.dao.connection.Conexion;
import gob.ar.itse.JuegoDeLadrillo.model.Ranking;
import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nico_
 */
public class RankingDao {
    
    String sentenciaSql;
    Connection conexion;
    ResultSet conjuntoDeRegistros;
    PreparedStatement sentencia;
    int score = JuegoDeLadrillos.score;
    int id ;
    int pos = 2;
    String nombre = JuegoDeLadrillos.iniciales;
    

    public RankingDao() {
        this.conexion = new Conexion().getConnection();
    }
    
    public List<Ranking> findAll() {
        List<Ranking> rankings = new ArrayList<>();
        
        
        try {
            sentenciaSql = "SELECT * FROM ranking ORDER BY score DESC";
            sentencia = conexion.prepareStatement(sentenciaSql);
            conjuntoDeRegistros = sentencia.executeQuery();
            while (conjuntoDeRegistros.next()) {
                String nombre = conjuntoDeRegistros.getString("nombre");
                int score = conjuntoDeRegistros.getInt("score");
                int pos = conjuntoDeRegistros.getInt("posicion");
                int id = conjuntoDeRegistros.getInt("id");
                
                Ranking ranking = new Ranking(nombre, score, pos, id);
                rankings.add(ranking);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RankingDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rankings;
    }
    
    public List<Ranking> find10() {
        List<Ranking> rankings = new ArrayList<>();
        
        
        try {
            sentenciaSql = "SELECT * FROM ranking ORDER BY score DESC LIMIT 10";
            sentencia = conexion.prepareStatement(sentenciaSql);
            conjuntoDeRegistros = sentencia.executeQuery();
            while (conjuntoDeRegistros.next()) {
                String nombre = conjuntoDeRegistros.getString("nombre");
                int score = conjuntoDeRegistros.getInt("score");
                int pos = conjuntoDeRegistros.getInt("posicion");
                int id = conjuntoDeRegistros.getInt("id");
                
                Ranking ranking = new Ranking(nombre, score, pos, id);
                rankings.add(ranking);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RankingDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rankings;
    }
    
    
    
    public int agregar(Ranking rankingIn) {
    
        int resultado = 0;
        try {
            sentenciaSql = "INSERT INTO ranking (nombre, score, posicion, id) VALUES (?, ?, ?, ?)";
            sentencia = conexion.prepareStatement(sentenciaSql);
            sentencia.setString(1, rankingIn.getNombre());
            sentencia.setInt(2, rankingIn.getScore());
            sentencia.setInt(3, rankingIn.getPos());
            sentencia.setInt(4, rankingIn.getId());
            
            
             
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RankingDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
