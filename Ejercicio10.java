package Parte1;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        Double pesoEsferaA = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el peso de la esfera B: ");
        Double pesoEsferaB = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el peso de la esfera C: ");
        Double pesoEsferaC = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el peso de la esfera D: ");
        Double pesoEsferaD = Double.parseDouble(teclado.nextLine());
        String esferaMasPesada = "0";
        String peso = "0";

        if ((pesoEsferaA.equals(pesoEsferaB))||(pesoEsferaA.equals(pesoEsferaC))){
            esferaMasPesada = "D";
            if (pesoEsferaD>pesoEsferaA){
                peso="Mayor";
            }else{
                peso="Menor";
            }
        } if ((pesoEsferaA.equals(pesoEsferaB))||(pesoEsferaA.equals(pesoEsferaD))){
            esferaMasPesada = "C";
            if (pesoEsferaC>pesoEsferaA){
                peso="Mayor";
            } else {
                peso="Menor";
            }
        } if ((pesoEsferaA.equals(pesoEsferaC))||(pesoEsferaA.equals(pesoEsferaD))){
            esferaMasPesada = "B";
            if (pesoEsferaB>pesoEsferaA){
                peso="Mayor";
            } else{
                peso="Menor";
            }
        } else {
            esferaMasPesada = "A";
        if (pesoEsferaA>pesoEsferaB){
            peso ="Mayor";
        } else{
            peso ="Menor";}
        }

        System.out.println("La esfera diferente es " + esferaMasPesada + " y esta es de " + peso + " que las demas.");
    }
    
}
