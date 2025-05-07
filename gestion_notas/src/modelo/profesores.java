/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class profesores {
   
    
    private Integer codigo;
    private String nombre;
    private String apellido;
    private String especializacion; 

    public profesores(Integer codigo, String nombre, String apellido, String especializacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especializacion = especializacion;
    }
       public profesores() {
        this.codigo = null;
        this.nombre = null;
        this.apellido = null;
        this.especializacion = null;
    }
       
    public void setCodigo(int codigo){
        this.codigo = codigo;
    } 
       
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecializacion() {
        return especializacion;
    }
    
}    

