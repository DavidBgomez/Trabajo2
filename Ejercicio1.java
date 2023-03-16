package Parte1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio1{
    /*Ejercicio 18 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el codigo del empleado: ");
        String codigoEmpleado = teclado.nextLine();
        System.out.print("Ingrese los nombres del empleado: ");
        String nombresEmpleado = teclado.nextLine();
        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        int horasTrabajadasAlMes = Integer.parseInt(teclado.nextLine());
        System.out.print("Ingrese el valor por hora trabajda: ");
        double valorHoraDeTrabajo = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el porcentaje de retencion en la fuente: ");
        int porcentajeDeRetencion = Integer.parseInt(teclado.nextLine());

        double salarioBruto = horasTrabajadasAlMes*valorHoraDeTrabajo;
        double retencionTotal = (salarioBruto*porcentajeDeRetencion)/100;
        double salarioNeto = salarioBruto -  retencionTotal;
        DecimalFormat df = new DecimalFormat("####.000");

        System.out.println("EMPLEADO: " + nombresEmpleado);
        System.out.println("CODIGO: " + codigoEmpleado);
        System.out.println("SALARIO BRUTO: " + df.format(salarioBruto));
        System.out.println("SALARIO NETO: " + df.format(salarioNeto));
    }
}