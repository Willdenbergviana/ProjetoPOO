public class ProjetoPraia {
    public static void main(String args[]){
        crianca c1 = new crianca();
        c1.altura = 1.60;
        c1.corCabelo = " Loiro";
        c1.corPele = "Branca";
        c1.idade = 10;
        c1.brincar();
        c1.correr(100);
        String sorriso = c1.sorrir();
        System.out.println(sorriso);

        crianca c2 = new crianca();
        c2.altura = 1.50;
        c2.corCabelo = " Preto";
        c2.corPele = "Parda";
        c2.idade = 8;
        c2.brincar();
        c2.correr(200);
        System.out.println(c2.sorrir());

        Canoa b1 = new Canoa();
        b1.tamanho = 3.0;
        b1.largura = 1.5;
        b1.capacidade = 120;
        b1.parado();




    }
}
