package ProjetoCarro;

public class Carro {
    String modelo, cor, marca, chassis;
    int ano, numeroportas, numeroMarchas, marchaAtual;
    double velocidadeMaxima, velocidadeAtual, volumeCombustivel;
    boolean tetoSolar, cambioAutomatico;
    Proprietario proprietario;

    void acelera(){
        velocidadeAtual = velocidadeAtual + 1;
    }
    void freia(){
        velocidadeAtual = 0;
    }
    void trocaMarcha(int marchaDesejada){

        marchaAtual = marchaDesejada;

    }
    void reduzMarcha(){
      marchaAtual = marchaAtual - 1;
    }


}
