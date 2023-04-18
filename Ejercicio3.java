/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author niko_
 */
public class Ejercicio3 {
   public static void main(String[] args){
       Scanner leer = new Scanner(System.in);
       String frase;
       System.out.println("Ingrese frase: ");
       frase = leer.nextLine();
       
       System.out.println("La frase en mayus es:"+frase.toUpperCase());
       System.out.println("La frase en minus es: "+frase.toLowerCase());
   } 
}
