package Parte1;
import java.util.Scanner;

public class Ejercicio9 {
    /*Ejercicio 14 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el total de ventas del departamento A: ");
        int ventasDepA = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese el total de ventas del departamento B: ");
        int ventasDepB = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese el total de ventas del departamento C: ");
        int ventasDepC = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese el salario de los vendedores: ");
        double salarioVendedores = Double.parseDouble(teclado.nextLine());
        double salarioAPagarDepA=salarioVendedores;
        double salarioAPagarDepB=salarioVendedores;
        double salarioAPagarDepC=salarioVendedores;

        int totalDeVentasEmpresa = ventasDepA + ventasDepB + ventasDepC;
        int porcentajeMinimoParaComisionar = ((totalDeVentasEmpresa*33)/100);

        if (ventasDepA>=porcentajeMinimoParaComisionar){
            salarioAPagarDepA=salarioVendedores+((salarioVendedores*20)/100);
        } if (ventasDepB>=porcentajeMinimoParaComisionar){
            salarioAPagarDepB=salarioVendedores+((salarioVendedores*20)/100);
        } if (ventasDepC>=porcentajeMinimoParaComisionar){
            salarioAPagarDepC=salarioVendedores+((salarioVendedores*20)/100);
        }

        System.out.println("El salario a pagar del departamento A es: " + salarioAPagarDepA);
        System.out.println("El salario a pagar del departamento B es: " + salarioAPagarDepB);
        System.out.println("El salario a pagar del departamento C es: " + salarioAPagarDepC);
    }
    
}
