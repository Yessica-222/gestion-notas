/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Profesores;
import Modelo.cursos;
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
public class control_cursos {

    private final String tabla = "curso";

    public void guardar(Connection conexion, cursos c) throws SQLException {
        try {
            PreparedStatement consulta;

            consulta = conexion.prepareStatement(
                    "INSERT INTO "
                    + this.tabla
                    + "(salon"
                    + ",horario,"
                    + "num_grupo,"
                    + "cod_profesor,"
                    + "cod_materia) "
                    + "VALUES(?, ?, ?, ?,?)");

            consulta.setString(1, c.getSalon());
            consulta.setString(2, c.getHorario());
            consulta.setInt(3, c.getNum_grupo());
            consulta.setInt(4, c.getCod_profesor());
            consulta.setInt(5, c.getCod_materia());

            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public void actualizar(Connection conexion, cursos c, int cod_prof, int cod_mat) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement(
                    "UPDATE "
                    + this.tabla
                    + " SET salon = ?,"
                    + " horario = ?,"
                    + " num_grupo = ?,"
                    + " cod_profesor = ?,"
                    + " cod_materia = ?  "
                    + "WHERE cod_profesor = ? "
                    + "and cod_materia = ?");

            consulta.setString(1, c.getSalon());
            consulta.setString(2, c.getHorario());
            consulta.setInt(3, c.getNum_grupo());
            consulta.setInt(4, c.getCod_profesor());
            consulta.setInt(5, c.getCod_materia());
            consulta.setInt(6, cod_prof);
            consulta.setInt(7, cod_mat);

            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public void eliminar(Connection conexion, int cod_prof, int cod_mat) throws SQLException {
        try {
            PreparedStatement consulta = conexion.prepareStatement(
                    "DELETE FROM "
                    + this.tabla
                    + " WHERE cod_profesor = ? "
                    + "and cod_materia = ? ");
            consulta.setInt(1, cod_prof);
            consulta.setInt(2, cod_mat);
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public List<cursos> recuperarTodas(Connection conexion) throws SQLException {
        List<cursos> c = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement(
                    "SELECT "
                    + "c.salon,"
                    + "c.horario,"
                    + "c.num_grupo,"
                    + "p.nombre_profesor,"
                    + "p.apellido_profesor,"
                    + "m.nombre_materia,"
                    + "p.cod_profesor,"
                    + "c.cod_materia "
                    + "from curso c natural join profesores p natural join materias m;");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                c.add(new cursos(
                        resultado.getString("salon"),
                        resultado.getString("horario"),
                        resultado.getInt("num_grupo"),
                        resultado.getString("nombre_profesor"),
                        resultado.getString("apellido_profesor"),
                        resultado.getString("nombre_materia"),
                        resultado.getInt("cod_profesor"),
                        resultado.getInt("cod_materia")));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return c;
    }
}
