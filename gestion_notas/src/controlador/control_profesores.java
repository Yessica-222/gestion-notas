/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.*;
/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class control_profesores {
    
    private final String tabla = "profesores";

   public void guardar(Connection conexion, Profesores p) throws SQLException{
      try{
         PreparedStatement consulta;
        
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(cod_profesor,nombre_profesor,apellido_profesor,especializacion) VALUES(?, ?, ?, ?)");
            consulta.setInt(1, p.getCodigo());
            consulta.setString(2, p.getNombre());
            consulta.setString(3, p.getApellido());
            consulta.setString(4,p.getEspecializacion());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   
   public void actualizar(Connection conexion,Profesores p, int codigo) throws SQLException{
       try{
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET cod_profesor = ?, nombre_profesor = ?, apellido_profesor = ?, especializacion = ? WHERE cod_profesor = ?");
            consulta.setInt(1, p.getCodigo());
            consulta.setString(2, p.getNombre());
            consulta.setString(3, p.getApellido());
            consulta.setString(4, p.getEspecializacion());
            consulta.setInt(5, codigo);
          
            consulta.executeUpdate();
       }
       catch(SQLException ex){
           throw  new SQLException(ex);
       }
   }
   
   public void eliminar(Connection conexion, int codigo) throws SQLException{
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE cod_profesor = ?");
         consulta.setInt(1, codigo);
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   public List<Profesores> recuperarTodas(Connection conexion) throws SQLException{
      List<Profesores> p = new ArrayList<>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT cod_profesor, nombre_profesor, apellido_profesor,especializacion FROM " + this.tabla + " ORDER BY cod_profesor");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            p.add(new Profesores(resultado.getInt("cod_profesor"), resultado.getString("nombre_profesor"), resultado.getString("apellido_profesor"), resultado.getString("especializacion")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return p;
   }
}
