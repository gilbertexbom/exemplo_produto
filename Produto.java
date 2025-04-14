public class Produto{
    //Atributos
    String descricao;
    double preco;
    double taxa;

    //Métodos
    public void imprimirProduto(){
        System.out.println("Descrição: " + descricao);
        System.out.printf("Preço R$ %.2f\n", preco);
        System.out.printf("Taxa de Imposto %.2f%%\n", taxa);
        System.out.printf("Preço de Venda R$ %.2f\n", this.calcularPrecoVenda());
    }

    public double calcularPrecoVenda(){
        return this.preco * (1 + (taxa/100));
    }


}