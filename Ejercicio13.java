package Parte1;
import java.util.Scanner;

public class Ejercicio13 {
    /*Ejercicio 24 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor de la primer esfera: ");
        double esferaA = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el valor de la segunda esfera:");
        double esferaB = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el valor de la tercera esfera: ");
        double esferaC = Double.parseDouble(teclado.nextLine());

        if ((esferaA>esferaB)&&(esferaA>esferaC)){
            System.out.println(esferaA+ " es mayor que " + esferaB + " y " + esferaC);
        } if ((esferaB>esferaA)&&(esferaB>esferaC)){
            System.out.println(esferaB+ " es mayor que " + esferaA + " y " + esferaC);
        } if ((esferaC>esferaA)&&(esferaC>esferaB)){
            System.out.println(esferaC+ " es mayor que " + esferaA + " y " + esferaB);
        }
    } 
    
}