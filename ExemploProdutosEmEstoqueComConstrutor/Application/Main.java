package ExemploProdutosEmEstoqueComConstrutor.Application;
import java.util.Locale;
import java.util.Scanner;
import ExemploProdutosEmEstoqueComConstrutor.Entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt","BR"));
        Scanner sc = new Scanner(System.in);
        System.out.println(" Este programa lê e manipula dados em um estoque.\nInsira o nome do produto: ");
        String nome= sc.nextLine();
        
        System.out.println("Insira o preço do produto:");
        double preço= sc.nextDouble();
        sc.nextLine();

        System.out.println("Insira a quantidade do produto em estoque:");
        int quantidade=sc.nextInt();
        sc.nextLine();

        Product one = new Product(nome, preço);
        System.out.println(one);
        System.out.println("Para realizar entrada no estoque do produto "+one.nome+" digite 0. Para realizar uma saída digite 1 e para encerrar o programa insira qualquer outro digito.");
        String decision = sc.nextLine();
        if(!decision.equals("0") && !decision.equals("1") )  {
            System.out.println("Programa encerrado");
        }else{
            do{
                if(decision.equals("0")){
                   System.out.println("Quantas unidades do produto "+one.nome+ " deseja dar entrada?");
                   int nmr=sc.nextInt();
                   sc.nextLine();
                   one.AddProducts(nmr);
                   System.out.println(one);
                } else{
                    System.out.println("Quantas unidades do produto "+one.nome+ " tiveram saída?");
                   int nmr=sc.nextInt();
                   sc.nextLine();
                   one.RemoveProducts(nmr);
                   System.out.println(one);
                }
                System.out.println("Para realizar saída no estoque do produto "+one.nome+" digite 0. Para realizar uma saída digite 1 e para encerrar o programa insira qualquer outro digito.");
                decision = sc.nextLine();
            }while(decision.equals("0") || decision.equals("1"));
        }System.out.println("Programa encerrado");
        sc.close();
    }
    
}
