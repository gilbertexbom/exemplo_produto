public class TesteProdutoImportado {
    public static void main(String[] args) {
        //Criação e instância do objeto
        ProdutoImportado produtoImportado = new ProdutoImportado();

        //Construção
        produtoImportado.origem = "China";
        produtoImportado.aliquota = 50.0;
        
        //Imprimir produto importado
        System.out.println("\n\t\t\t -- Produto Importado 1 -- \n");
        produtoImportado.imprimirProdutoImportado();

        
    }
}
