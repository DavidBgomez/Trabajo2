package Parte2;

public class PruebaFiguras {
    public static void main(String[] args){
        Circulo figura1 = new Circulo(4);
        Rectangulo figura2 = new Rectangulo(5, 2);
        Cuadrado figura3 = new Cuadrado(19);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 17);

        System.out.println("El area del circulo es: " + figura1.calcularAreaCirculo());
        System.out.println("El perimetro del circulo es: " + figura1.calcularPerimetroCirculo());
        System.out.println(" ");
        System.out.println("El area del rectangulo es: " + figura2.calcularAreaRectangulo());
        System.out.println("El perimetro del rectangulo es: " + figura2.calcularPerimetroRectangulo());
        System.out.println(" ");
        System.out.println("El area del cuadradfo es: " + figura3.calcularAreaCuadrado());
        System.out.println("El perimetro del rectangulo es: " + figura3.calcularPerimetroCuadrado());
        System.out.println(" ");
        System.out.println("El area del Triangulo Rectangulo es: " + figura4.calcularAreaTrianguloRectangulo());
        System.out.println("El perimetro del Triangulo rectangulo es: " + figura4.calcularPerimetroTrianguloRectangulo());
        System.out.println("La hipotenusa del triangulo rectangulo es: " + figura4.calcularHipotenusa());
        System.out.println("Este triangulo es de tipo: " + figura4.determinarTipoDeTriangulo());
    } 
}


