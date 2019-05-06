package Exercicio02;

public class Retangulo implements IcalcGeometria {
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calPerimetro() {
        return this.base * this.altura * 2;
    }

    @Override
    public double calcArea() {
        return this.base * this.altura;
    }
}
