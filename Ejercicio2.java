package Parte1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio2 {
    /*Ejercicio 19 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el lado del triangulo equilatero: ");
        Double ladoTriangulo = Double.parseDouble(teclado.nextLine());

        double perimetro = (3*ladoTriangulo);
        double area = ((Math.sqrt(3)/4)*Math.pow(ladoTriangulo, 2));
        double altura = (Math.sqrt(3)/2)*ladoTriangulo;
        DecimalFormat df = new DecimalFormat("####.0");

        System.out.println("El perimetro es: " +  df.format(perimetro));
        System.out.println("El area es: " + df.format(area));
        System.out.println("La Altura es: " + df.format(altura));
    }
    
}
