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
public class Extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        int n=read.nextInt();
        int v[];
        v=Relleno(n);
        Imprimir(v,n);
        
        
    }
    
    public static int[] Relleno(int array){
        int [] v= new int[array];
        for (int i = 0; i < array ; i++) {  
            v[i]=(int) (Math.random()*10);
        }
        return v;
    }
    
    public static void Imprimir(int v[], int n){
        for (int i = 0; i < n; i++) {  
            System.out.print("["+v[i]+"]");
        }
        System.out.println("");
    }
    
}
