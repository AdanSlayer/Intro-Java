/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 * 24. Realizar un programa que complete un vector con los N primeros números de
 * la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la
 * sucesión de los siguientes números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 *
 * @author USER
 */
public class Extra24 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el número de sucesiones de Fibonacci");
        int n = read.nextInt();
        int[] V = new int[n];
        V[0]=1;
        int num1 = 0, num2 = 1, suma;
        System.out.println(" ");
        for (int i = 1; i <n; i++) {
            suma = num1 + num2;
            V[i]=suma;
            num1 = num2;
            num2 = suma;
            
        }
        for (int i = 0; i <n; i++) {
                System.out.println(V[i]);
        }
    }

}
