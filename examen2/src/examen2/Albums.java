/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Albums {
    //nombre, un artista y una lista de canciones
    private String nombre;
    private String artista;
    private ArrayList <Canciones> listaCanciones = new ArrayList();

    public Albums() {
    }

    public Albums(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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

