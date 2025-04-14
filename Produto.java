public class Produto{
    //Atributos
    private String descricao;
    private double preco;
    private double taxa;

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

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setTaxa(double taxa){
        this.taxa = taxa;
    }

    public double getTaxa(){
        return this.taxa;
    }

    Produto(String descricao, double preco, double taxa){
        this.descricao = descricao;
        this.preco = preco;
        this.taxa = taxa;
    }

    Produto(){
        this.descricao = "Não definido";
        this.preco = 0.00;
        this.taxa = 0.00;
    }


}