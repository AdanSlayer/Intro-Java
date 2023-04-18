/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author fluce
 */
public class Ejercicio8 {
public static void main (String [] args){

Scanner leer = new Scanner(System.in);

System.out.println("Ingrese frase");
String frase = leer.nextLine();
int longitud = frase.length();
if (longitud ==8) { 
    System.out.println("Correcto 8 caracteres");
}
else {
    System.out.println("Incorrecto no tiene 8 caracteres");
}
   
}
}
