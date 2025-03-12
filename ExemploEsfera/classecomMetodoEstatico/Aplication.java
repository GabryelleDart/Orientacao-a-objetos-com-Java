package ExemploEsfera.classecomMetodoEstatico;
import java.util.Scanner;

import ExemploEsfera.classecomMetodoEstatico.utils.Calculator;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do raio:");
        float raio =sc.nextFloat();
        Calculator.Circunferencia(raio);
       

    }
    
}
