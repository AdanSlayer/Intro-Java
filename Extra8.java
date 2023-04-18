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
public class Extra8 {
   public static void main(String[] args) {
        // TODO code application logic here
        /* Escriba un programa que lea números enteros. Si el número es múltiplo 
        de cinco debe detener la lectura y mostrar la cantidad de números leídos,
        la cantidad de números pares y la cantidad de números impares. 
        Al igual que en el ejercicio anterior los números negativos no deben 
        sumarse. Nota: recordar el uso de la sentencia break.*/
        Scanner leer = new Scanner(System.in);
        int numero;
        int cont = 0;
        int cp = 0;
        int ci = 0;

        
        do {
            System.out.println("Ingrese los números");
            numero = leer.nextInt();

            if (numero > 0) {
                cont++;
                 if (numero % 2 == 0) {
                    cp++;
                } else {
                    ci++;
                }
                 if (numero % 5 == 0) {
                    System.out.println("El numero es multiplo de cinco: " + numero);
                    break;
                }

            }

        } while (true);
        System.out.println("La cantidad de numeros pares es: " + cp);
        System.out.println("La cantidad de numeros impares es: " + ci);
        System.out.println("La cantidad total de numeros es: " + cont);
    }

} 
    
