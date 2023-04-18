/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 *
 * @author USER
 */
public class Extra7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números");
        int n = read.nextInt(), num;
        int max = 0,min=1000000;
        double suma=0;
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Ingrese el número de la posición " + (i + 1));
                num = read.nextInt();
            } while (num < 0);
            suma=suma+num;
            if (max<num) {
                max=num;                
            }else{
                max=max;    
            }
            if (min>num) {
                min=num;                
            }else{
                min=min;    
            }
        }
        System.out.println(" ");
        System.out.println("El máximo es: "+max);
        System.out.println("El mínimo es: "+min);
        System.out.println("El promedio es: "+(suma/n));
    }
}
