package Parte1;
import java.util.Scanner;

public class Ejercicio4 {
    /*Ejercicio 7 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Asigne un valor para A: ");
        int A = Integer.parseInt(teclado.nextLine());
        System.out.print("Asigne un valor para B: ");
        int B = Integer.parseInt(teclado.nextLine());

        if (A < B){
            System.out.println(A + " es menor que " + B);
        } if (A > B){
            System.out.println(A + " es mayor que " + B);
        } if (A == B){
            System.out.println(A + " es igual que " + B);
        }
    }
    
}
