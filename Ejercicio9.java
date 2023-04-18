/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package guia7_ex6;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
         System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        
        
         if(frase.charAt(0)=='A'){
            System.out.println("correcta");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
