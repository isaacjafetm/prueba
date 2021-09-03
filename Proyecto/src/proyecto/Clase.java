/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 24661
 */
public class Clase implements Serializable{
    private int ID;
    private String nombre;
    private int UV, semestre, periodo;
    private int año;
    private ArrayList<Examen> examenes = new ArrayList();
    private Maestros maestro;

    public Clase() {
    }

    public Clase(int ID, String nombre, int UV, int semestre, int periodo, int año) {
        this.ID = ID;
        this.nombre = nombre;
        this.UV = UV;
        this.semestre = semestre;
        this.periodo = periodo;
        this.año = año;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUV() {
        return UV;
    }

    public void setUV(int UV) {
        this.UV = UV;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public Maestros getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestros maestro) {
        this.maestro = maestro;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
