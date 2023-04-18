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
public class Extra14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int n = read.nextInt();
        int m,e;
        int []fam = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("¿Cuantos hijos tiene la familia "+(i+1)+"?");
            m = read.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("¿Qué edad tiene el hijo "+(j+1)+"?");
                e = read.nextInt();
                fam[i]=fam[i]+e;
            }
            fam[i]=fam[i]/m;
        }
    } 
}
