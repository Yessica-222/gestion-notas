/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class Control_matriculas {
    private String tabla = "matricula";
    
    public List<Matricula> recuperarTodas(Connection conexion) throws SQLException {
        List<Matricula> m = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement(
                    "SELECT "
                    + "e.cod_estudiante, "
                    + "e.nombre_estudiante, "
                    + "e.apellido_estudiante, "
                    + "p.cod_profesor, "
                    + "p.nombre_profesor, "
                    + "p.apellido_profesor, "
                    + "m.cod_materia, "
                    + "m.nombre_materia, "
                    + "ma.observacion,"
                    + "c.horario "
                    + "from "
                    + "matricula ma natural join "
                    + "profesores p natural join "
                    + "materias m natural join estudiantes e "
                    + "natural join curso c;");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                m.add(new Matricula(
                        resultado.getInt("cod_estudiante"),
                        resultado.getString("nombre_estudiante"),
                        resultado.getString("apellido_estudiante"),
                        resultado.getInt("cod_profesor"),
                        resultado.getString("nombre_profesor"),
                        resultado.getString("apellido_profesor"),
                        resultado.getInt("cod_materia"),
                        resultado.getString("nombre_materia"),
                        resultado.getString("observacion"),
                        resultado.getString("horario")));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return m;
    }
    
    public void guardar(Connection conexion, Matricula matr) throws SQLException {
        try {
            PreparedStatement consulta;

            consulta = conexion.prepareStatement(
                    "INSERT INTO "
                    + this.tabla
                    + "(cod_estudiante,"
                    + "cod_profesor,"
                    + "cod_materia,"
                    + "observacion) "
                    + "VALUES(?, ?, ?, ?)");

            consulta.setInt(1, matr.getCod_estudiante());
            consulta.setInt(2, matr.getCod_profesor());
            consulta.setInt(3, matr.getCod_materia());
            consulta.setString(4, matr.getObservacion());
            

            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
    public void actualizar(Connection conexion, Matricula m, int cod_profesor, int cod_materia, int cod_estudiante) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement(
                    "UPDATE "
                    + this.tabla
                    + " SET cod_estudiante = ?,"
                    + " cod_materia = ?,"
                    + " cod_profesor = ?,"
                    + " observacion = ? "
                    + "WHERE cod_profesor = ? "
                    + "and cod_materia = ? "
                    + "and cod_estudiante = ?;");

            consulta.setInt(1, m.getCod_estudiante());
            consulta.setInt(2, m.getCod_materia());
            consulta.setInt(3, m.getCod_profesor());
            consulta.setString(4, m.getObservacion());
            consulta.setInt(5, cod_profesor);
            consulta.setInt(6, cod_materia);
            consulta.setInt(7, cod_estudiante);

            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
            
        }
        
    }
    public void eliminar(Connection conexion, int cod_profesor, int cod_materia,int cod_estudiante) throws SQLException {
        try {
            PreparedStatement consulta = conexion.prepareStatement(
                    "DELETE FROM "
                    + this.tabla
                    + " WHERE cod_profesor = ? "
                    + "and cod_materia = ? "
                    + "and cod_estudiante = ?;");
            consulta.setInt(1, cod_profesor);
            consulta.setInt(2, cod_materia);
            consulta.setInt(3, cod_estudiante);
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
    
    public List<Matricula> buscar_por_estudiante(Connection conexion,int cod_estudiante) throws SQLException {
        List<Matricula> m = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement(
                    "SELECT "
                    + "e.cod_estudiante, "
                    + "e.nombre_estudiante, "
                    + "e.apellido_estudiante, "
                    + "p.cod_profesor, "
                    + "p.nombre_profesor, "
                    + "p.apellido_profesor, "
                    + "m.cod_materia, "
                    + "m.nombre_materia, "
                    + "ma.observacion,"
                    + "c.horario "
                    + "from "
                    + "matricula ma natural join "
                    + "profesores p natural join "
                    + "materias m natural join estudiantes e "
                    + "natural join curso c "
                            + "where e.cod_estudiante = ?;");
            consulta.setInt(1, cod_estudiante);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                m.add(new Matricula(
                        resultado.getInt("cod_estudiante"),
                        resultado.getString("nombre_estudiante"),
                        resultado.getString("apellido_estudiante"),
                        resultado.getInt("cod_profesor"),
                        resultado.getString("nombre_profesor"),
                        resultado.getString("apellido_profesor"),
                        resultado.getInt("cod_materia"),
                        resultado.getString("nombre_materia"),
                        resultado.getString("observacion"),
                        resultado.getString("horario")));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return m;
    }
}
