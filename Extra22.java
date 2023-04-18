/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 *
 * @author USER
 */
public class Extra22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = read.nextInt();
        int m = read.nextInt();
        int suma=0;
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                int num = (int) (Math.random() * 20);
                matriz[i][j] = num;
                suma=suma+num;
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("La suma es "+suma);
    }
}
