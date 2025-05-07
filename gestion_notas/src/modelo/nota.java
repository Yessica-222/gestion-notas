/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class nota {

    private Integer cod_estudiante;
    private String nom_estudiante;
    private Integer cod_materia;
    private String nom_materia;
    private Integer cod_profesor;
    private String nom_profesor;
    private String horario;
    private Double nota_1;
    private Double nota_2;
    private Double nota_3;
    private Double nota_final;

    public nota(Integer cod_estudiante, String nom_estudiante, Integer cod_materia, String nom_materia, Integer cod_profesor, String nom_profesor, String horario, double nota_1, double nota_2, double nota_3, double nota_final) {
        this.cod_estudiante = cod_estudiante;
        this.nom_estudiante = nom_estudiante;
        this.cod_materia = cod_materia;
        this.nom_materia = nom_materia;
        this.cod_profesor = cod_profesor;
        this.nom_profesor = nom_profesor;
        this.horario = horario;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
        this.nota_final = nota_final;
    }

    public nota() {
       this.cod_estudiante = null;
        this.nom_estudiante = null;
        this.cod_materia = null;
        this.nom_materia = null;
        this.cod_profesor = null;
        this.nom_profesor = null;
        this.horario = null;
        this.nota_1 = null;
        this.nota_2 = null;
        this.nota_3 = null;
        this.nota_final = null; 
    }

    public void setCod_estudiante(Integer cod_estudiante) {
        this.cod_estudiante = cod_estudiante;
    }

    public void setNom_estudiante(String nom_estudiante) {
        this.nom_estudiante = nom_estudiante;
    }

    public void setCod_materia(Integer cod_materia) {
        this.cod_materia = cod_materia;
    }

    public void setNom_materia(String nom_materia) {
        this.nom_materia = nom_materia;
    }

    public void setCod_profesor(Integer cod_profesor) {
        this.cod_profesor = cod_profesor;
    }

    public void setNom_profesor(String nom_profesor) {
        this.nom_profesor = nom_profesor;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNota_1(Double nota_1) {
        this.nota_1 = nota_1;
    }

    public void setNota_2(Double nota_2) {
        this.nota_2 = nota_2;
    }

    public void setNota_3(Double nota_3) {
        this.nota_3 = nota_3;
    }

    public void setNota_final(Double nota_final) {
        this.nota_final = nota_final;
    }
    
//______________________________________________________

    public Integer getCod_estudiante() {
        return cod_estudiante;
    }

    public String getNom_estudiante() {
        return nom_estudiante;
    }

    public Integer getCod_materia() {
        return cod_materia;
    }

    public String getNom_materia() {
        return nom_materia;
    }

    public Integer getCod_profesor() {
        return cod_profesor;
    }

    public String getNom_profesor() {
        return nom_profesor;
    }

    public String getHorario() {
        return horario;
    }

    public Double getNota_1() {
        return nota_1;
    }

    public Double getNota_2() {
        return nota_2;
    }

    public Double getNota_3() {
        return nota_3;
    }

    public Double getNota_final() {
        return nota_final;
    }
}
