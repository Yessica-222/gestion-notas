/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */

package controlador;

import java.sql.*;
import java.util.*;
import Modelo.*;

public class control_materias {

    private final String tabla = "materias";

    public void guardar(Connection conexion, materias m) throws SQLException {
        try {
            PreparedStatement consulta;

            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(cod_materia,nombre_materia,grado_materia) VALUES(?,?,?)");
            consulta.setInt(1, m.getId());
            consulta.setString(2, m.getNombre());
            consulta.setInt(3, m.getGrado());
            
            consulta.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void actualizar(Connection conexion, materias m,int codigo) throws SQLException {
        try {
            PreparedStatement consulta;

            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET cod_materia = ?,nombre_materia = ?, grado_materia = ?  WHERE cod_materia = ?");
            consulta.setInt(1, m.getId());
            consulta.setString(2, m.getNombre());
            consulta.setInt(3, m.getGrado());
            consulta.setInt(4,codigo);
            consulta.executeUpdate();
        } catch (Exception e) {
        }
    }

    public materias recuperarPorId(Connection conexion, int id) throws SQLException {
        materias m = null;
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT cod_materia,nombre_materia,grado_materia FROM " + this.tabla + " WHERE grado_materia = ?");
            consulta.setInt(1, id);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                m = new materias(id, resultado.getInt("cod_materia"), resultado.getString("nombre_materia"), resultado.getString("grado_materia"));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return m;
    }

    public void Eliminar(Connection conexion,int m) throws SQLException {
        try {
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE cod_materia = ?");
           consulta.setInt(1, m);
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public List<materias> recuperarTodas(Connection conexion) throws SQLException {
        List<materias> m = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT cod_materia,nombre_materia,grado_materia FROM " + this.tabla + " ORDER BY grado_materia");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                m.add(new materias(resultado.getInt("cod_materia"), resultado.getString("nombre_materia"), resultado.getInt("grado_materia")));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return m;
    }

}
