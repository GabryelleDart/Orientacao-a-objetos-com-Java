package ExemploProdutosEmEstoqueComConstrutoreGeteSet.Entities;

public class Product {
    private String nome;
    private double preço;
    private int quantidade;
    

    public Product(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    
    public Product(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setPreço(double preço){
        this.preço=preço;
    }

    /*public void setQuantidade(int quantidade){
        this.quantidade=quantidade;

    }*/
    public String getNome(){
        return nome;
    }
    public double getPreço(){
        return preço;
    }
    public int getQuantidade(){
        return quantidade;
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
    