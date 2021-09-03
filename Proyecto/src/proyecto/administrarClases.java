/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 24661
 */
public class administrarClases implements Serializable{

    private ArrayList<Clase> listaclase = new ArrayList();
    private File archivo = null;
    private static final long serialVersionUID = 1L;

    public administrarClases(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clase> getListaclase() {
        return listaclase;
    }

    public void setListaclase(ArrayList<Clase> listaclase) {
        this.listaclase = listaclase;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarClases{" + "listaclase=" + listaclase + ", archivo=" + archivo + '}';
    }

    public void setClase(Clase c) {
        listaclase.add(c);
    }

    public void cargarArchivo() {
        try {            
            listaclase = new ArrayList();
            Clase temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clase) objeto.readObject()) != null) {
                        listaclase.add(temp);
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
            for (Clase t : listaclase) {
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
