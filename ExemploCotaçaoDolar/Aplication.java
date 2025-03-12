package ExemploCotaçaoDolar;

import java.util.Scanner;

import ExemploCotaçaoDolar.utils.CurrencyConverter;

public class Aplication {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Qual o valor do dolar?");
        double cotacao= sc.nextDouble();
        System.out.println("Quantos voce deseja comprar?");
        int quantidade =sc.nextInt();
        System.out.printf("Valor total em reais: %.2f",CurrencyConverter.Convert(cotacao,quantidade));
        sc.close();
    }
}
