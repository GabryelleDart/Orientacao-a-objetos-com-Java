package ExemploAlturacomArray;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m=0;
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("Insira o numero de pessoas que serao medidas:");
        int nmr=sc.nextInt();
        double [] alturas = new double[nmr];
        for(int i=0;i<nmr;i++){
            System.out.println("Insira a altura da "+(i+1)+ " ° pessoa:");
            alturas[i]=sc.nextDouble();
            m+=alturas[i];
        }
        System.out.printf("A media das alturas das "+nmr+ " pessoas são: %.2f",(m/nmr));


        sc.close();
    }
    
}
