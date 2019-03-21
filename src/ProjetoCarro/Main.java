package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Willdenberg";
        proprietario.bairro = "Icoaraci";
        proprietario.cep = "66813390";
        proprietario.estado = "Pará";
        proprietario.cidade = "Belém";
        proprietario.rua = "Travessa S3 N° 185";

        Carro carro = new Carro();
        carro.numeroportas = 5;
        carro.proprietario = proprietario;
        carro.velocidadeAtual = 10.0;
        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        carro.freia();
        System.out.println(carro.velocidadeAtual);


    }
}
