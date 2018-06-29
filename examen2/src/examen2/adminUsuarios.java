/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class adminUsuarios {
    
    private ArrayList<Usuarios> listaUsuarios = new ArrayList();
    private File archivo = null;
    
    public adminUsuarios(String path){
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaPersonas(ArrayList<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
  
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminPersona{" + "listaPersonas=" + listaUsuarios + '}';
    }
       
    //extra metodo
    
    public void setUsuarios(Usuarios p){
        this.listaUsuarios.add(p);
    }

    public void cargarArchivo(){
        try{
            listaUsuarios = new ArrayList();
            Usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (Usuarios) objeto.readObject()) != null){
                        listaUsuarios.add(temp);
                    }
                } catch (EOFException e){
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close(); //siempre object close y despues canal close. 
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : listaUsuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
}

