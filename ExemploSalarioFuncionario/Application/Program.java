package ExemploSalarioFuncionario.Application;
import java.util.Scanner;

import ExemploSalarioFuncionario.Entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Insira o nome do funcionário :");
        funcionario.nome= sc.nextLine();
        System.out.println("Insira o sálario bruto do funcionario "+ funcionario.nome +" :");
        funcionario.salarioBruto= sc.nextDouble();
        System.out.println("Insira o  imposto relativo ao sálario bruto do funcionario "+ funcionario.nome +" :");
        funcionario.imposto= sc.nextDouble();
        System.out.println(funcionario);
        System.out.println("Insira a porcentagem de aumento para o salario do funcionario "+ funcionario.nome+" .");
        int per = sc.nextInt();
        funcionario.AumentarSalario(per);
        System.out.println("Salario atualizado:" +funcionario);
        sc.close();
        
    }
    
}
