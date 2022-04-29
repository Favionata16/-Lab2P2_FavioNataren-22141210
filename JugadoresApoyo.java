/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_favionataren_22141210;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elbal
 */
public class JugadoresApoyo {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    ArrayList<jugadores> jugadoresLista = new ArrayList<jugadores>();
    
    //Constructor
    public JugadoresApoyo(){
        jugadoresLista.add(new jugadores("Pion"));
    }
    
    

    
    //Función para registrar un nuevo jugador
    public void registrar(){
        System.out.print("Ingrese nombre: ");
        String nombreCient = leer.next();
        if (nombreUnico(nombreCient)==null){
            
            jugadoresLista.add(new jugadores(nombreCient));
        }else{
            System.out.println("El nombre científico ingresado no es único. No se puede registrar");
        }
            
    }
    
    //Función para imprimir todos los datos de los jugadores
    public void imprimirPosicion(){

    }
    
    //Función para imprimir lista completa
    public void imprimirTodos(){
        for(jugadores jugador: jugadoresLista){
            jugador.imprimir();
        }
    }
    

    //Función para verificar si ya existe un nombre 
    public jugadores nombreUnico(String nombre){
        for(jugadores jugador: jugadoresLista){
            if (jugador.nombre.equals(nombre))
                //Retornar jugador porque ya existe ese nombre
                return jugador;
        }
        //Si no existe el nombre, retornar null
        return null;
    }
    
}
