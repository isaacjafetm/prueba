/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 24661
 */
public class administrarMaestros implements Serializable{
    private ArrayList<Maestros> listamaestros = new ArrayList();
    private File archivo = null;
    private static final long serialVersionUID = 1L;
    
    public administrarMaestros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Maestros> getListamaestros() {
        return listamaestros;
    }

    public void setListamaestros(ArrayList<Maestros> listamaestros) {
        this.listamaestros = listamaestros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarMaestros{" + "listamaestros=" + listamaestros + ", archivo=" + archivo + '}';
    }
    
    public void setMaeestros(Maestros maestro){
        this.listamaestros.add(maestro);
    }
    
    public void cargarArchivo() {
        try {            
            listamaestros = new ArrayList();
            Maestros temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Maestros) objeto.readObject()) != null) {
                        listamaestros.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Maestros t : listamaestros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
