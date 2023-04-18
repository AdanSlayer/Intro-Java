/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Extra1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int t= read.nextInt();
        convertir(t);
    } 
        
    

    public static void convertir(int t) {
            
        int d= (t/1440);
        int h = ((t/60)-(d*24));
        System.out.println(d + " día ," + h + " horas");
        
    }

}

