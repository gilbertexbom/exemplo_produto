public class TesteProduto {
    public static void main(String[] args) {
        //Criação e instância de objeto da classe produto
        Produto produto = new Produto();

        //Construção do objeto
        produto.descricao = "Banana";
        produto.preco = 300.0;
        produto.taxa = 20.0;

        //Imprimir os dados do produto
        System.out.println("\n\t\t\t -- Produto 1 -- \n");
        produto.imprimirProduto();



    }
}
