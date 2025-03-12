package ExemploProdutosEmEstoqueComConstrutor.Entities;

public class Product {
    public String nome;
    public double preço;
    public int quantidade;
    

    public Product(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
  
    public Product(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }
    public double TotalValueInStock(){
    
        return preço*quantidade;
    }
    public void AddProducts(int quantidade){
        this.quantidade+=quantidade;
    }
    public void RemoveProducts(int quantidade){
        this.quantidade-=quantidade;
    }
    @Override
    public String toString() {
        return          "Nome do Produto= " +nome+ 
                        "\nPreço= " +String.format("%.2f", preço)+ 
                        "\nQuantidade em estoque=" + quantidade+ 
                        "\nValor total em estoque= " + String.format("%.2f",TotalValueInStock());
    }
    
    
}
