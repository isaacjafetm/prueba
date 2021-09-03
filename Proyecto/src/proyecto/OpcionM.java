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
public class OpcionM extends Pregunta implements Serializable{
    private ArrayList<String> opciones = new ArrayList();
    public OpcionM() {
        super();
    }

    public OpcionM(String texto) {
        super(texto);
    }

    public ArrayList<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<String> opciones) {
        this.opciones = opciones;
    }
    
}
