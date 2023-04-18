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
public class Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scaner = new Scanner(System.in);
        
        //variable contar aprobados y desaprobados
        double contA = 0, contDA = 0;
        
        //Matriz de 10 filas y 5 columnas
        double[][] estudiantes = new double[10][5];
        
        

        System.out.println("INGRESAR NOTAS");
     
        for (int i = 0; i < 10; i++) {
            System.out.println(" * ESTUDIANTE #" + (i+1));
           
            for (int j = 0; j < 5; j++) {
                switch (j) {
                    case 0:
                        {
                        System.out.print("    Primer trabajo practico: ");
                        estudiantes[i][j] = scaner.nextDouble();
                    }
                    case 1: {
                        System.out.print("    Segundo trabajo practico: ");
                        estudiantes[i][j] = scaner.nextDouble();
                    }
                    case 2: {
                        System.out.print("    Primer Integrador: ");
                        estudiantes[i][j] = scaner.nextDouble();
                    }
                    case 3: {
                        System.out.print("    Segundo integrador: ");
                        estudiantes[i][j] = scaner.nextDouble();
                        System.out.println("--------------------------------------------------");
                    }
                    default: {
                        //Promedio
                        estudiantes[i][j] = (estudiantes[i][0] * 0.1) + (estudiantes[i][1] * 0.15) + (estudiantes[i][2] * 0.25) + (estudiantes[i][3] * 0.50);
                        if (estudiantes[i][j] >= 7) {
                            contA++;
                        }else{
                            contDA++;
                        }
                    }
                }
            }
        }
        
        
        
        
        
        
        System.out.println("INFORME DE NOTAS");
       
        //Imprimir para verificar
        for (int i = 0; i < 10; i++) {
            System.out.println(" * ESTUDIANTE #" + (i+1));
            
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + estudiantes[i][j] + "]");
            }
            System.out.println("");
          
        }
        
        System.out.println("      Aprobados: " + contA);
        System.out.println("      Desaprobados: " + contDA);
       
    }
    
}
    
