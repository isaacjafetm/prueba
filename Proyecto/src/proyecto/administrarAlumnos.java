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
public class administrarAlumnos implements Serializable{
    private ArrayList<Alumnos> listaalumnos = new ArrayList();
    private File archivo = null;
    
     private static final long serialVersionUID = 1L;

    public administrarAlumnos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumnos> getListaalumnos() {
        return listaalumnos;
    }

    public void setListaalumnos(ArrayList<Alumnos> listaalumnos) {
        this.listaalumnos = listaalumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarAlumnos{" + "listaalumnos=" + listaalumnos + ", archivo=" + archivo + '}';
    }
    
    public void setAlumno(Alumnos a){
        this.listaalumnos.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listaalumnos = new ArrayList();
            Alumnos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Alumnos) objeto.readObject()) != null) {
                        listaalumnos.add(temp);
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
            for (Alumnos t : listaalumnos) {
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
