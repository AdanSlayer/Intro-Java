/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author fluce
 */
public class ejercicio7 {
public static void main (String[] args){
Scanner leer = new Scanner (System.in);

System.out.println("Ingrese contraseña");
String frase = leer.nextLine();
frase = toLowerCase(frase);

if (frase.equals("eureka")) {
System.out.println("Su contraseña es correcta");
}
else {
System.out.println("Su contraseña es incorrecta");
}


    
}
}

