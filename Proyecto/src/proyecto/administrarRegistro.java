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
public class administrarRegistro implements Serializable{
    private File archivo = null;
    private ArrayList<Registro> listaregistro = new ArrayList();

    public administrarRegistro(String path) {
        this.archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Registro> getListaregistro() {
        return listaregistro;
    }

    public void setListaregistro(ArrayList<Registro> listaregistro) {
        this.listaregistro = listaregistro;
    }

    @Override
    public String toString() {
        return "administrarRegistro{" + "archivo=" + archivo + ", listaregistro=" + listaregistro + '}';
    }
    
    public void setRegistro(Registro r){
        listaregistro.add(r);
    }
    
    public void cargarArchivo() {
        try {            
            listaregistro = new ArrayList();
            Registro temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Registro) objeto.readObject()) != null) {
                        listaregistro.add(temp);
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
            for (Registro t : listaregistro) {
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
