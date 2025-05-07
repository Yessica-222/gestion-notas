/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class estudiantes {
    
    private Integer codigo_estudiante;
    private String nombre_estudiante;
    private String apellido_estudiante;
    private String telefono; 

    public estudiantes(Integer codigo_estudiante, String nombre, String apellido, String telefono) {
        this.codigo_estudiante = codigo_estudiante;
        this.nombre_estudiante = nombre;
        this.apellido_estudiante = apellido;
        this.telefono = telefono;
    }
       public estudiantes() {
        this.codigo_estudiante = null;
        this.nombre_estudiante = null;
        this.apellido_estudiante = null;
        this.telefono = null;
    }

   
    
    public void setCodigo_estudiante(Integer codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }
    
    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public void setApellido_estudiante(String apellido_estudiante) {
        this.apellido_estudiante = apellido_estudiante;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCodigo_estudiante() {
        return codigo_estudiante;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public String getApellido_estudiante() {
        return apellido_estudiante;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}
