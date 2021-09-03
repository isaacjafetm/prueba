/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 24661
 */
public class Examen {
    private String nombre;
    private Date fecha;
    private int hora, duracion;
    private ArrayList<Pregunta> preguntas = new ArrayList();
    private ArrayList<String> respuestas = new ArrayList();

    public Examen() {
    }

    public Examen(String nombre, Date fecha, int hora, int duracion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "Examen{" + "fecha=" + fecha + ", hora=" + hora + ", duracion=" + duracion + ", preguntas=" + preguntas + ", respuestas=" + respuestas + '}';
    }
    
    
}
