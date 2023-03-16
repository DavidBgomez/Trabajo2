package Parte1;
import java.util.Scanner;

public class Ejercicio7 {
    /*Ejercicio 12 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombreDelTrabajador = teclado.nextLine();
        System.out.print("Ingrese el numero de horas trabajadas: ");
        int horasTrabajadas = Integer.parseInt(teclado.nextLine());
        System.out.print("Valor de hora trabajadas: ");
        double valorHoraDeTrabajo =  Double.parseDouble(teclado.nextLine());
        double totalPagado=0;
        int horasExtrasTrabajadas=0;
        double valorHorasExtrasTrabajadas=0;

        if (horasTrabajadas>40){
            horasExtrasTrabajadas= horasTrabajadas-40;
            if (horasExtrasTrabajadas>8){
                horasExtrasTrabajadas=horasExtrasTrabajadas-8;
                valorHorasExtrasTrabajadas=(valorHoraDeTrabajo*3);
                totalPagado=((valorHorasExtrasTrabajadas*horasExtrasTrabajadas)+((valorHoraDeTrabajo*2)*8)+(40*valorHoraDeTrabajo));
            }else{
                valorHorasExtrasTrabajadas= (valorHoraDeTrabajo*2);
                totalPagado = (valorHorasExtrasTrabajadas*horasExtrasTrabajadas) + (40*valorHoraDeTrabajo); 
            }
        } else{
            totalPagado = (horasTrabajadas*valorHoraDeTrabajo);
        }

        System.out.println("El nombre del trabajado: " + nombreDelTrabajador);
        System.out.println("El salario pagado al trabajador es: " + totalPagado);
    }      
}