package Parte1;
import java.util.Scanner;

public class Ejercicio8 {
    /*Ejercicio 13 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        double valorDeCompra = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el color de la bola sacada por el cliente: ");
        String colorBola = teclado.nextLine();
        double descuento=0;
        double valorAPagar=0;

        if (colorBola.equals("Rojo")){
            descuento = (1.0);
        } if (colorBola.equals("Azul")){
            descuento = (0.5);
        } if (colorBola.equals("Amarillo")){
            descuento = (0.25);
        } if (colorBola.equals("Verde")){
            descuento = (0.1);
        } if (colorBola.equals("Blanco")){
            descuento = (0.0);
        }

        valorAPagar = valorDeCompra - (valorDeCompra*descuento);

        System.out.println("El valor a pagar por esta compra es de " + valorAPagar + " por haber obtenido la bola de color " + colorBola);
    }
    
}
