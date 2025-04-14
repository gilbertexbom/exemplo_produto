public class ProdutoImportado {
    //Atributos
    String origem;
    double aliquota;

    //Métodos
    public void imprimirProdutoImportado(){
        System.out.println("Origem: " + origem);
        System.out.printf("Alíquota de Importação %.2f%%", aliquota);
    }
    
}
