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
public class Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//------------------------------------------------------------------------------
        //Matriz de 20X20
        String[][] sopaL = new String[20][20];
        //Vector que va a guardar las palabras
        String[] palabra = new String[5];
//------------------------------------------------------------------------------
        //Longitud de la palabra
        int cantidad;
        //contador de errores
        int contE;
        //numero al azar
        int num;
        
        
        //Pedir palabras
        System.out.println("INGRESE PALABAS DE MIN 3 Y MAX 5 CARACTERES");
        for (int i = 0; i < 5; i++) {
            contE = 0;
            do {
                if (contE == 0) {
                    
                    System.out.print("Ingrese palabra #" + (i+1) + ": ");
                    palabra[i] = read.next();
                    cantidad = palabra[i].length();
                    contE++;
                }else{
                  
                    System.out.println("Palabra no cumple con la condicion, intentelo de nuevo");
                    
                    System.out.print("Ingrese palabra #" + (i+1) + ": ");
                    palabra[i] = read.next();
                    cantidad = palabra[i].length();
                }
            } while (cantidad > 5 || cantidad < 3);
        }
        
        //Inicializar la matriz de 20X20
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                num = (int)(Math.random()*9);
                sopaL[i][j] = String.valueOf(num);
                //System.out.print("[" + sopaL[i][j] + "]");
            }
            //System.out.println("");
        }
        
        //Llenar matriz con las palabras
        /*Primer for para la palabra*/
        for (int i = 0; i < 5; i++) {
            //Saber la cantidad de la palabra
            cantidad = palabra[i].length();
            //Numero de fila al azar
            num = (int)(Math.random()*19);
            
            /*For para la matriz*/
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < cantidad; k++) {
                    if (num == j) {
                        sopaL[j][k] = String.valueOf(palabra[i].charAt(k));
                    }
                }  
            }
        }
        
        //Imprimir la matriz de 20X20
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
               
                System.out.print("[" + sopaL[i][j] + "]");
            }
            System.out.println("");
        }
    }  
}
