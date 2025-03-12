package ExemploSalarioFuncionario.Entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    @Override
    public String toString() {
        return "Funcionario: " + nome + 
        "\nSalario Liquido =" + (salarioBruto - imposto);
    }

    public void AumentarSalario(double porcentagem){
        salarioBruto+= salarioBruto*(porcentagem/100);

    }
    
}
