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
public class Pregunta implements Serializable{
    private String texto;

    public Pregunta() {
    }

    public Pregunta(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "texto=" + texto + '}';
    }
    
}
