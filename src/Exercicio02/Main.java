package Exercicio02;

public class Main {
    public static void main(String args[]){
        Quadrado q = new Quadrado(10.0);
        System.out.println(q.calcArea());
        System.out.println(q.calPerimetro());

        Circulo c = new Circulo(10.0);
        System.out.println(c.calcArea());
        System.out.println(c.calPerimetro());


    }
}
