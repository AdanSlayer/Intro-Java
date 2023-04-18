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
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        float f, c;
        System.out.print("Ingrese el valor en centigrados: ");
        c = leer.nextFloat();
        f = (32+(9*c/5));
        System.out.println("La temperatura den Fahrenheit es: " + f);
        
    }
}
