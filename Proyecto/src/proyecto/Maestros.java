/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public class Maestros extends Usuarios implements Serializable{
    private int ID;
    private String nombre, profesion;
    private int sueldo;
    private String rol;
    private ArrayList<Clase> clases = new ArrayList();
    

    public Maestros() {
        super();
    }

    public Maestros(int ID, String nombre, String profesion, int sueldo, String rol, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.ID = ID;
        this.nombre = nombre;
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.rol = rol;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
