public class TesteProduto {
    public static void main(String[] args) {
        //Criação e instância de objeto da classe produto
        Produto produto = new Produto();

        //Construção do objeto
        /*
        produto.descricao = "Banana";
        produto.preco = 300.0;          obsoleto
        produto.taxa = 20.0;
        */

        produto.setDescricao("Banana");
        produto.setPreco(300.0);
        produto.setTaxa(20.0);

        //Imprimir os dados do produto
        System.out.println("\n\t\t\t -- Produto 1 -- \n");
        produto.imprimirProduto();

        //Outro produto
        Produto outroProduto = new Produto("Feijão", 600, 20.0);

        //Imprimir outro produto
        System.out.println("\n\t\t\t -- Outro Produto --\n");
        outroProduto.imprimirProduto();


    }
}
