/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_favionataren_22141210;

/**
 *
 * @author elbal
 */
public class jugadores {

    //Atributos
    String nombre;
    int victorias;

    //Constructor
    public jugadores(String nombre, int victorias) {
        this.nombre = nombre;
        this.victorias=victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    
    

    //Funciones
    //Función para imprimir los atributos
    public void imprimir() {
        System.out.println("[Nombre: " + nombre + " Victorias: " + victorias+"]");
    }

}
