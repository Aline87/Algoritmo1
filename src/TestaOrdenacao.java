package br.com.produtos;

public class TestaOrdenacao {
    public static void main(String[] args) {
        Produto produtos[] = {
                new Produto(" Lamborghini", 1000000),
                new Produto(" Jipe ", 480000),
                new Produto(" Brasilia ", 16000),
                new Produto(" Smart", 46000),
                new Produto(" Lamborghini", 17000),
        };
        //selectionSort (produtos, produtos.length);
        novoSort(produtos, produtos.length);
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " Custa " + produto.getPreco());
        }
    }
    private static void novoSort (Produto[]produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos; atual++) {
            int analise=atual;
            while (analise > 0 && produtos[analise].getPreco()<produtos [analise-1].getPreco()){
                System.out.println("Estou trocando"+ analise + "com"+ (analise -1));

                Produto produtoAnalise = produtos [analise];
                Produto produtoAnaliseMenos1 = produtos [analise-1];
                System.out.println("Estou trocando"+ produtoAnalise.getNome() + "com"
                        + produtoAnaliseMenos1.getNome());

                produtos [analise]= produtoAnaliseMenos1;
                produtos [analise-1]= produtoAnalise;
                analise--;
            }
        }

    }

    private static void SelectionSort (Produto[]produtos, int quantidadeDeElementos){
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
                System.out.println(" Estou na casinha"+ atual);
                int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);
                System.out.println(" Trocando" + atual + " Com o "+ menor);
                Produto produtoAtual = produtos[atual];
                Produto produtoMenor = produtos[menor];
                System.out.println(" Trocando" + produtoAtual.getNome() + " "+ produtoMenor.getNome());
                produtos[atual] = produtoMenor;
                produtos[menor] = produtoAtual;


                }
            }

            private static int buscaMenor (Produto[]produtos,int inicio, int termino){
            int maisBarato = inicio;
            for (int atual = inicio; atual <= termino; atual++) {
                if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                    maisBarato = atual;

                }
            }
            return maisBarato;
        }
    }



