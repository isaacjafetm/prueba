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
public class Registro extends Usuarios implements Serializable{

    public Registro() {
        super();
    }

    public Registro(String usuario, String contraseña) {
        super(usuario, contraseña);
    }
    
}
