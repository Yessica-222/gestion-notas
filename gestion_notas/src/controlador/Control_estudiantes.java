/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.estudiantes;
/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class Control_estudiantes {
    private final String tabla = "estudiantes";

   public void guardar(Connection conexion, estudiantes e) throws SQLException{
      try{
         PreparedStatement consulta;
         
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(cod_estudiante, nombre_estudiante, apellido_estudiante, telefono) VALUES(?, ?, ?,?)");
            consulta.setInt(1, e.getCodigo_estudiante());
            consulta.setString(2, e.getNombre_estudiante());
            consulta.setString(3, e.getApellido_estudiante());
            consulta.setString(4, e.getTelefono());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   public void actualizar(Connection conexion,estudiantes e,int cod_es) throws SQLException{
       try{
           PreparedStatement comando;
           
           comando = conexion.prepareStatement("UPDATE "+this.tabla+" SET cod_estudiante = ?,nombre_estudiante = ?,apellido_estudiante = ?,telefono = ? where cod_estudiante = ?");
           
           comando.setInt(1, e.getCodigo_estudiante());
            comando.setString(2, e.getNombre_estudiante());
            comando.setString(3, e.getApellido_estudiante());
            comando.setString(4, e.getTelefono());
            comando.setInt(5, cod_es);
            
            comando.executeUpdate();
       }catch(SQLException ex){
           throw  new SQLException(ex);
       }
   }
   public List<estudiantes> recuperarPorCodigo_estudiante(Connection conexion, int codigo_estudiante) throws SQLException {
            List<estudiantes> e = new ArrayList<>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT cod_estudiante,nombre_estudiante, apellido_estudiante, telefono FROM " + this.tabla + " WHERE cod_estudiante = ?" );
         consulta.setInt(1, codigo_estudiante);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            e.add(new estudiantes(resultado.getInt("cod_estudiante"), resultado.getString("nombre_estudiante"), resultado.getString("apellido_estudiante"), resultado.getString("telefono")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return e;
   }
   public void eliminar(Connection conexion, int cod_es) throws SQLException{
      try{
         PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE cod_estudiante = ?");
         consulta.setInt(1, cod_es);
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   public List<estudiantes> recuperarTodas(Connection conexion) throws SQLException{
      List<estudiantes> e = new ArrayList<>();
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT cod_estudiante, nombre_estudiante, apellido_estudiante, telefono FROM " + this.tabla + " ORDER BY telefono");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            e.add(new estudiantes(resultado.getInt("cod_estudiante"), resultado.getString("nombre_estudiante"), resultado.getString("apellido_estudiante"), resultado.getString("telefono")));
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return e;
   }
}
