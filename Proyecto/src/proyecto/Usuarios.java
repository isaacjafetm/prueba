/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.Serializable;

/**
 *
 * @author 24661
 */
public class Usuarios implements Serializable{
    private String usuario, contraseña;

    public Usuarios() {
    }

    public Usuarios(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
