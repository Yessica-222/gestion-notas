/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class cursos {
    private String salon;
    private String horario;
    private Integer num_grupo;
    private String nombre_profesor;
    private String ape_profesor;
    private String nombre_materua;
    private Integer cod_profesor;
    private Integer cod_materia;

    public Integer getCod_profesor() {
        return cod_profesor;
    }

    public void setCod_profesor(Integer cod_profesor) {
        this.cod_profesor = cod_profesor;
    }
    
    public void setApe_profesor(String apr_profesor){
        this.ape_profesor = apr_profesor;
    }
    
    public String getApe_profesor(){
        return ape_profesor;
    }
    public Integer getCod_materia() {
        return cod_materia;
    }

    public void setCod_materia(Integer cod_materia) {
        this.cod_materia = cod_materia;
    }

    public cursos(String salon, String horario, Integer num_grupo, String nombre_profesor,String ape_profesor, String nombre_materua, Integer cod_profesor, Integer cod_materia) {
        this.salon = salon;
        this.horario = horario;
        this.num_grupo = num_grupo;
        this.nombre_profesor = nombre_profesor;
        this.nombre_materua = nombre_materua;
        this.cod_profesor = cod_profesor;
        this.cod_materia = cod_materia;
        this.ape_profesor = ape_profesor;
    }

    

    public cursos() {
        this.salon = null;
        this.horario = null;
        this.num_grupo = null;
        this.nombre_profesor = null;
        this.nombre_materua = null;
        this.cod_profesor = null;
        this.cod_materia = null;
        this.ape_profesor = null;
    }
    
    
    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getNum_grupo() {
        return num_grupo;
    }

    public void setNum_grupo(Integer num_grupo) {
        this.num_grupo = num_grupo;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getNombre_materua() {
        return nombre_materua;
    }

    public void setNombre_materua(String nombre_materua) {
        this.nombre_materua = nombre_materua;
    }

   
    
}
