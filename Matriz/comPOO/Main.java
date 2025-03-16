package Matriz.comPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero de linhas da matriz:");
        int linhas=sc.nextInt();
        System.out.println("Insira o numero de linhas da matriz:");
        int colunas=sc.nextInt();
        Matriz mat = new Matriz(linhas, colunas);
        mat.LeDados(sc);
        System.out.println(mat);
        sc.close();
    }
    
}
