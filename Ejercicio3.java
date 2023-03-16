package Parte1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer lado del triangulo: ");
        double lado1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el valor del segundo lado del triangulo: ");
        double lado2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el valor del tercer lado del triangulo: ");
        double lado3 = Double.parseDouble(teclado.nextLine());

        double perimetro = lado1+lado2+lado3;
        double semiperimetro = perimetro/2;
        double area = Math.sqrt(perimetro*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado3));
        DecimalFormat df = new DecimalFormat("###.0");

        System.out.println("El perimetro del triangulo es: " +  df.format(perimetro));
        System.out.println("El semiperimetro del triangulo es: " + df.format(semiperimetro));
        System.out.println("El Area del triangulo es: " + df.format(area));
    }
    
}
