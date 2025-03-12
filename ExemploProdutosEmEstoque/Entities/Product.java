package ExemploProdutosEmEstoque.Entities;

public class Product {
    public String nome;
    public double preço;
    public int quantidade;

    


    public Product() {
        //TODO Auto-generated constructor stub
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
        return          "Nome do Produto= " + nome + 
                        "\nPreço= " + preço + 
                        "\nQuantidade em estoque=" + String.format("%.2f", preço)+ 
                        "\nValor total em estoque= " + String.format("%.2f",TotalValueInStock());
    }
    
    
}
