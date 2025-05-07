/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class Matricula {

    private Integer cod_estudiante;
    private String nom_estudiante;
    private String Ape_estudiante;
    private Integer cod_profesor;
    private String nom_profesor;
    private String ape_profesor;
    private Integer cod_materia;
    private String nom_materia;
    private String observacion;
    private String horario;

    public Matricula(Integer cod_estudiante, String nom_estudiante, String Ape_estudiante, Integer cod_profesor, String nom_profesor, String ape_profesor, Integer cod_materia, String nom_materia, String observacion, String horario) {
        this.cod_estudiante = cod_estudiante;
        this.nom_estudiante = nom_estudiante;
        this.Ape_estudiante = Ape_estudiante;
        this.cod_profesor = cod_profesor;
        this.nom_profesor = nom_profesor;
        this.ape_profesor = ape_profesor;
        this.cod_materia = cod_materia;
        this.nom_materia = nom_materia;
        this.observacion = observacion;
        this.horario = horario;
    }

    public Matricula() {
        this.cod_estudiante = null;
        this.nom_estudiante = null;
        this.Ape_estudiante = null;
        this.cod_profesor = null;
        this.nom_profesor = null;
        this.ape_profesor = null;
        this.cod_materia = null;
        this.nom_materia = null;
        this.horario =  null;
    }

    public void setCod_estudiante(Integer cod_estudiante) {
        this.cod_estudiante = cod_estudiante;
    }

    public void setNom_estudiante(String nom_estudiante) {
        this.nom_estudiante = nom_estudiante;
    }

    public void setApe_estudiante(String Ape_estudiante) {
        this.Ape_estudiante = Ape_estudiante;
    }

    public void setCod_profesor(Integer cod_profesor) {
        this.cod_profesor = cod_profesor;
    }

    public void setNom_profesor(String nom_profesor) {
        this.nom_profesor = nom_profesor;
    }

    public void setApe_profesor(String ape_profesor) {
        this.ape_profesor = ape_profesor;
    }

    public void setCod_materia(Integer cod_materia) {
        this.cod_materia = cod_materia;
    }

    public void setNom_materia(String nom_materia) {
        this.nom_materia = nom_materia;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public void setHorario(String hoario){
        this.horario = horario;
    }
    public Integer getCod_estudiante() {
        return cod_estudiante;
    }

    public String getNom_estudiante() {
        return nom_estudiante;
    }

    public String getApe_estudiante() {
        return Ape_estudiante;
    }

    public Integer getCod_profesor() {
        return cod_profesor;
    }

    public String getNom_profesor() {
        return nom_profesor;
    }

    public String getApe_profesor() {
        return ape_profesor;
    }

    public Integer getCod_materia() {
        return cod_materia;
    }

    public String getNom_materia() {
        return nom_materia;
    }

    public String getObservacion() {
        return observacion;
    }
    
    public String getHorario(){
        return horario;
    }
    
}
