package Parte1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio5 {
    /*Ejercicio 10 */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de inscripción: ");
        String numInscripcion = teclado.nextLine();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = teclado.nextLine();
        System.out.print("Ingrese el valor del patrimonio del estudiante: ");
        double patrimonioEstudiante = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el Estrato Social del estudiante: ");
        int estratoEstudiante = Integer.parseInt(teclado.nextLine());
        Double valorMatricula = 50.000;
        
        if ((patrimonioEstudiante>2000.000) && (estratoEstudiante>3)){
            Double aumento = ((patrimonioEstudiante*3)/100);
            valorMatricula = valorMatricula+aumento;
        }

        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("El numero de inscripcion del estudiante " + nombreEstudiante + " es " + numInscripcion);
        System.out.println("El valor a pagar por concepto de matricula es: " + df.format(valorMatricula));
    }
    
}
