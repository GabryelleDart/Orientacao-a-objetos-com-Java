package ExemploEsfera.comMetodosNaMesmaClasse;
import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do raio:");
        float raio =sc.nextFloat();
        Calculo.Circunferencia(raio);
        Calculo.Volume(raio);
        Calculo.PI();

    }
    public static void Circunferencia(float raio ){
        System.out.printf("Circunferencia: %.2f", (2*Math.PI*raio));
    }
    public static void Volume(float raio ){
        System.out.printf("\nVolume: %.2f", ((4/3)*Math.PI*(Math.pow(raio, 3 ))));
    }
    public static void PI( ){
        System.out.printf("\nValor de PI: %.2f", (Math.PI));
    }
    
}
