package br.com.produtos;

public class TestaMenorPreco {
    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto(" Lamborghini", 1000000),
                new Produto(" Jipe ", 480000),
                new Produto(" Brasilia ", 16000),
                new Produto(" Smart", 46000),
                new Produto(" Lamborghini", 17000),
        };
        int maisBarato = buscaMenor(produtos, 0 , 4);
        System.out.println(maisBarato);
        System.out.println("O carro" + produtos[maisBarato].getNome()
                + ", é o mais barato e custa R$ " + produtos[maisBarato].getPreco());
    }

    private static int buscaMenor(Produto[] produtos,int inicio , int termino ) {
        int maisBarato =inicio;
        for (int atual = inicio ; atual <= 4; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;

            }
        }
        return maisBarato;
    }


}



















