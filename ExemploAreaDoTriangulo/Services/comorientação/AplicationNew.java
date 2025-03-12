package ExemploAreaDoTriangulo.Services.comorientação;
import java.util.Scanner;

import ExemploAreaDoTriangulo.Entities.Triangulo;
public class AplicationNew{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Esse programa lê as medidas de dois triangulos X e Y , calcula a área e mostra qual dos 2 é o maior.");
        Triangulo[] triangulos=new Triangulo[2];
        triangulos[0]=new Triangulo();
        triangulos[1]=new Triangulo();
        for (int i=0 ;i< triangulos.length;i++){
            System.out.println("Insira as medidas dos 3 lados do triangulo " + ((i==0)?"X":"Y"));
            triangulos[i].a = sc.nextDouble();
            triangulos[i].b = sc.nextDouble();
            triangulos[i].c = sc.nextDouble();
            System.out.println(" Área do triângulo"+ ((i==0)?"X":"Y")+" ="+ (triangulos[i].area()));
    }
        if(triangulos[1].area() >= triangulos[0].area()){
            System.out.println("O triângulo de maior área  é o  Y" );
        }else{
            System.out.println("O triângulo de maior área  é o  X" );   
        }
        sc.close();
    }
}