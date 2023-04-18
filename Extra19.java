/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 *
 * @author USER
 */
public class Extra19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();
        int[] V1 = new int [n];
        int[] V2 = new int [n];
        int num;
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del Vector 1 en la posición "+(i+1));
            num = read.nextInt();
            V1[i]= num;   
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del Vector 2 en la posición "+(i+1));
            num = read.nextInt();
            V2[i]= num;   
        }
        for (int i = 0; i < n; i++) {
            if (V1[i]==V2[i]) {
                flag = true;
            }else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
