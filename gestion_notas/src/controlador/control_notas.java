/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Nota;
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
public class control_notas {

    public List<Nota> buscar_por_estudiante(Connection conexion, int cod_estudiante) throws SQLException {
        List<Nota> m = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement(
                    "SELECT m.cod_estudiante,e.nombre_estudiante,m.cod_profesor,p.nombre_profesor,m.cod_materia,mat.nombre_materia,c.horario,m.observacion,n.nota_1,n.nota_2,n.nota_3,n.nota_final"
                    + " from matricula m natural join materias mat natural join estudiantes e natural join profesores p natural join curso c"
                    + " left join notas n on n.cod_estudiante = m.cod_estudiante "
                    + " and m.cod_materia = n.cod_materia and n.cod_profesor = m.cod_profesor having m.cod_estudiante = ?;");
            consulta.setInt(1, cod_estudiante);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                m.add(new Nota(
                        resultado.getInt("cod_estudiante"),
                        resultado.getString("nombre_estudiante"),
                        resultado.getInt("cod_profesor"),
                        resultado.getString("nombre_profesor"),
                        resultado.getInt("cod_materia"),
                        resultado.getString("nombre_materia"),
                        resultado.getString("horario"),
                        resultado.getDouble("nota_1"),
                        resultado.getDouble("nota_1"),
                        resultado.getDouble("nota_3"),
                        resultado.getDouble("nota_final")));

            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return m;
    }
}
