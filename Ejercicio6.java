package Parte1;
import java.util.Scanner;

public class Ejercicio6 {
    /*Ejercicio 11 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        int num2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese el tercer numero: ");
        int num3 = Integer.parseInt(teclado.nextLine());

        if ((num1>num2)&&(num1>num3)){
            System.out.println(num1+ " es mayor que " + num2 + " y " + num3);
        } if ((num2>num1)&&(num2>num3)){
            System.out.println(num2+ " es mayor que " + num1 + " y " + num3);
        } if ((num3>num1)&&(num3>num2)){
            System.out.println(num3+ " es mayor que " + num1 + " y " + num2);
        } 
    }
}
