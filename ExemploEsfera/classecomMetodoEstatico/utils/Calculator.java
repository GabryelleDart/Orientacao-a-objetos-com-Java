package ExemploEsfera.classecomMetodoEstatico.utils;

public class Calculator {
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
