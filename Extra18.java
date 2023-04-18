/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 * @author USER
 */
public class Extra18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt(), c=0;
        int[] vector = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número de la posición "+(i+1));
            int num = read.nextInt();
            c=c+num;
            vector[i]=num;
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
        System.out.println(" ");
        System.out.println("La suma del vector es: "+c);
    }
    
}
