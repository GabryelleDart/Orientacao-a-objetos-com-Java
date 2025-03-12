package ExemploRetangulo.Application;
import java.util.Scanner;

import ExemploRetangulo.Entities.Retangulo;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Insira a a largura do triângulo.");
        retangulo.widhtlargura=sc.nextDouble();
        System.out.println("Insira a a altura do triângulo.");
        retangulo.heightaltura=sc.nextDouble();
        System.out.println(retangulo);
    }
    

    
    
}
