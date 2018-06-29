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
public class Usuarios implements Serializable {
    //Los usuarios poseen un nombre,
//edad, username, password, playlists , favoritos.
    private String nombre;
    private int edad;
    private String username;
    private String password;
    private ArrayList listaPlaylist = new ArrayList();
    private ArrayList listafavoritos = new ArrayList();
    private static final long SerialVersionUID=777L;

    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public Usuarios(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getListaPlaylist() {
        return listaPlaylist;
    }

    public void setListaPlaylist(ArrayList listaPlaylist) {
        this.listaPlaylist = listaPlaylist;
    }

    public ArrayList getListafavoritos() {
        return listafavoritos;
    }

    public void setListafavoritos(ArrayList listafavoritos) {
        this.listafavoritos = listafavoritos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", edad=" + edad + ", username=" + username + ", password=" + password + ", listaPlaylist=" + listaPlaylist + ", listafavoritos=" + listafavoritos + '}';
    }

    
    
    
}
