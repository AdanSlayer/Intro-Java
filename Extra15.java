/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;
import java.util.Scanner;

/**Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 *
 * @author USER
 */
public class Extra15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        double num2 = read.nextInt();
        System.out.println("Seleccione una operacion: 1.Sumar 2.Restar 3.Multiplicar 4.Dividir");
        int op = read.nextInt();
        switch(op){
            case 1: 
                System.out.println(num1+num2);
            break;
            case 2:
                System.out.println(num1-num2);
            break;
            case 3:
                System.out.println(num1*num2);
            break;
            case 4:
                System.out.println(num1/num2);
            break;
            default: 
                    System.out.println("Elegiste una opción inválida");
        }
                
    }
    
}
