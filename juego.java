/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_favionataren_22141210;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elbal
 */
public class juego {
    ArrayList<String> gg = new ArrayList<String>();
    int numero;
    static Scanner leer = new Scanner(System.in);
    public void numRandom() {
        
        
        
        int min = 0;
        int max = 7;

        Random random = new Random();

        int a = random.nextInt(max + min) + min;
        int b = random.nextInt(max + min) + min;
        int c = random.nextInt(max + min) + min;
        int d = random.nextInt(max + min) + min;

        
        
        String numa = Integer.toString(a);
        String numb = Integer.toString(b);
        String numc = Integer.toString(c);
        String numd = Integer.toString(d);
        
        numero = Integer.parseInt(numa + numb + numc + numd);
        System.out.println(a+"-"+b+"-"+c+"-"+d);
        
        gg.add(numa);
        gg.add(numb);
        gg.add(numc);
        gg.add(numd);
        
        
    }
    
    public void dd(String q,String w, String e, String r){
        for (String str : gg) {
            
            if(str.equals(q)){
                System.out.print("+");
            }else if(str.equals(w)){
                System.out.print("+");
            }else if(str == "3"){
                System.out.print("+");
            }else if(str == "4"){
                System.out.print("+");
            }else {
                System.out.print("x");
            }
        }
    }
    
    public void game() {
        JugadoresApoyo j = new JugadoresApoyo();
        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;

        do {
            System.out.print("Introduzca la clave de la caja fuerte: ");
            numeroIntroducido = leer.nextInt();

            if (numeroIntroducido == numero) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }

            intentos--;

        } while ((intentos > 0) && (!acertado));

        if (acertado) {
            System.out.println("Ha abierto la caja fuerte.");
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    }
    

}
