package ExemploVetorDeProdutos.aplication;

import java.util.Locale;
import java.util.Scanner;

import ExemploVetorDeProdutos.entities.Produto;

public class Main {
    public static void main(String[] args) {
        double m=0;
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("Insira o numero de produtos em promoção:");
        int nmr=sc.nextInt();
        Produto[] promo = new Produto[nmr];
        sc.nextLine();
        for(int i=0;i<nmr;i++){
        
            System.out.println("Insira o nome do "+(i+1)+" produto:");
            String nome= sc.nextLine();
        
            System.out.println("Insira o preço do "+(i+1)+" produto:");
            double preço=sc.nextDouble();
            m+=preço;
            promo[i]=new Produto(nome, preço);
            sc.nextLine();
    
        }
        System.out.printf("A media dos preços dos  "+nmr+ " produtos são: %.2f",(m/nmr));


        sc.close();
    }
    
}