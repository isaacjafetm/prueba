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
public class Alumnos extends Usuarios implements Serializable{
    private int cuenta;
    private String nombre, carrera;
    private int clases_cur=0;
    private String rol;
    private ArrayList<Clase> clases = new ArrayList();

    public Alumnos() {
        super();
    }

    public Alumnos(int cuenta, String nombre, String carrera, String rol, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.rol = rol;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getClases_cur() {
        return clases_cur;
    }

    public void setClases_cur(int clases_cur) {
        this.clases_cur = clases_cur;
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
