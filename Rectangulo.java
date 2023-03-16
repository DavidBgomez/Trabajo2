package Parte2;

public class Rectangulo {
    int base;
    int altura;

    Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }

    public double calcularAreaRectangulo(){
        return base*altura;
    }

    public double calcularPerimetroRectangulo(){
        return (2*base)+(2*altura);
    }
    
}
