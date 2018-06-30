/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Playlist implements Serializable{
    
    private String nombre;
    private ArrayList <Canciones> listaCanciones = new ArrayList();
    private static final long SerialVersionUID=75L;

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Canciones> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
