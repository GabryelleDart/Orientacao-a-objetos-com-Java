package ExemploAreaDoTriangulo.Services.semorientaçãoaobjetos;
import java.util.Scanner;
public class Aplication{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i,ii=0;
    double a, b ,c, p;
    double area=0;

        System.out.println(" Esse programa lê as medidas de dois triangulos X e Y , calcula a area e define qual dos 2 é maior.");
        for(i=1; i<=2;i++){
                System.out.println("Insira as medidas dos 3 lados do triangulo " + ((i==1)?"X":"Y"));
                a=sc.nextDouble();
                b=sc.nextDouble();
                c=sc.nextDouble();
                p=(a+b+c)/2;
                System.out.printf("A área do triangulo " + ((i==1)?"X":"Y")+" é :  %.3f.2%n ", Math.sqrt(p*(p-a)*(p-b)*(p-c)));
                if (area<=Math.sqrt(p*(p-a)*(p-b)*(p-c))){
                    area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    ii=i;
                }
        }
        System.out.println("O triângulo de maior área  é o " + ((ii==1)?"X":"Y")+" .");
        sc.close();
    }
}
