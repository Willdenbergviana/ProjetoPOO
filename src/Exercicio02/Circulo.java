package Exercicio02;

public class Circulo implements IcalcGeometria {
        private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return( Math.PI * Math.pow(this.raio, 2)) ;
    }

    @Override
    public double calPerimetro() {
        return ( 2 * Math.PI * this.raio);
    }
}
