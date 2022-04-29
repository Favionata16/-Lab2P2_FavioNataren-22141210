/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_favionataren_22141210;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author elbal
 */
public class juego {
    ArrayList<String> gg = new ArrayList<String>();
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
            }else if(str == e){
                System.out.print("+");
            }else if(str == r){
                System.out.print("+");
            }else {
                System.out.print("x");
            }
        }
    }
    

}
