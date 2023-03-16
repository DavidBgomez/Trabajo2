package Parte1;
import java.util.Scanner;

public class Ejercicio12 {
    /*Ejercicio 23 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double valorA = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el valor de B: ");
        double valorB = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el valor de C: ");
        double valorC = Double.parseDouble(teclado.nextLine());

        double discriminante = (Math.pow(valorB, 2) - 4*valorA*valorC);

        if (discriminante<0){
            System.out.println("No se puede resolver");
        } else{
            double valor1Ecuacion = ((-1)*(valorB) + Math.sqrt(discriminante))/(2*valorA);
            double valor2Ecuacion = ((-1)*(valorB) - Math.sqrt(discriminante))/(2*valorA);
            System.out.println("Resultado 1 de la ecuacion cuadratica es: " + valor1Ecuacion);
            System.out.println("Resultado 2 de la ecuacion cuadratica es: " + valor2Ecuacion);
        }
    }
}
