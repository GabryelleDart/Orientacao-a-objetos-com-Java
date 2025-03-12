package ExemploAreaDoTriangulo.Services.comorientação;
import java.util.Scanner;

import ExemploAreaDoTriangulo.Entities.Triangulo;
public class Aplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Esse programa lê as medidas de dois triangulos X e Y , calcula a área e mostra qual dos 2 é o maior.");
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();
        System.out.println("Insira as medidas dos 3 lados do triangulo X. ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble(); 
        System.out.println(" Área do triângulo X ="+ (x.area()));
        System.out.println("Insira as medidas dos 3 lados do triangulo Y. ");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble(); 
        System.out.println(" Área do triângulo X =" + y.area());
        if(y.area() >= x.area()){
            System.out.println("O triângulo de maior área  é o  Y" );
        }else{
            System.out.println("O triângulo de maior área  é o  X" );   
        }
        sc.close();
    }
}