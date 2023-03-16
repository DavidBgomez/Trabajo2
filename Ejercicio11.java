package Parte1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio11 {
    /*Ejercicio 22 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = teclado.nextLine();
        System.out.print("Ingrese el valor de la hora de trabajo: ");
        Double valorHoraDeTrabajo = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado: ");
        int cantidadHorasTrabajadas = Integer.parseInt(teclado.nextLine());
        DecimalFormat df = new DecimalFormat("###.000");

        double salarioDelEmpleado = (valorHoraDeTrabajo*cantidadHorasTrabajadas);

        if (salarioDelEmpleado>450.00){
            System.out.println("NOMBRE: "+ nombreEmpleado);
            System.out.println("SALARIO MENSUAL: " + df.format(salarioDelEmpleado));
        } else{
            System.out.println("NOMBRE: " + nombreEmpleado);
        }
    }
}
