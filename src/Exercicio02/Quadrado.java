package Exercicio02;

public class  Quadrado implements IcalcGeometria {
    private double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calPerimetro() {
        return this.lado * 4 ;
    }
}
