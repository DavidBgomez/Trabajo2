package Parte2;
public class TrianguloRectangulo {
    int base;
    int altura;

    TrianguloRectangulo(int base, int altura){
        this.altura=altura;
        this.base=base;
    }

    public double calcularAreaTrianguloRectangulo(){
        return ((base*altura)/2);
    }
    
    public double calcularPerimetroTrianguloRectangulo(){
        return (base + altura + calcularHipotenusa());
    }

    public double calcularHipotenusa(){
        return (Math.pow(base*base + altura*altura, 0.5));
    }

    public String determinarTipoDeTriangulo(){
        double hipotenusa = calcularHipotenusa();
        String tipoDeTriangulo = null;
        if ((base==altura)&&(base==hipotenusa)&&(hipotenusa==altura)){
            tipoDeTriangulo = "El triangulo es equilatero";
        } if ((base!=altura)&&(base!=hipotenusa)&&(hipotenusa!=altura)){
            tipoDeTriangulo = "El triangulo es escaleno";
        } else{
            tipoDeTriangulo = "El triangulo es isoceles";
        }

        return tipoDeTriangulo;
    }
}

