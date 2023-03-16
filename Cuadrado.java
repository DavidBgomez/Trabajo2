package Parte2;
public class Cuadrado {
    int lado;

    Cuadrado(int lado){
        this.lado = lado;
    }

    public double calcularAreaCuadrado(){
        return lado*lado;
    }

    public double calcularPerimetroCuadrado(){
        return (4*lado);
    }
}
