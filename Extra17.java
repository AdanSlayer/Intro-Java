/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;
/**Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 *
 * @author USER
 */
public class Extra17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int n = read.nextInt(),c=0;
        boolean bandera;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {c++;                
            }
        }
        if (c>2) { bandera=false;
            
        }else{bandera=true;
        }
        System.out.println(bandera);
    }
}
