package Matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira a quantidade de linhas da matriz:");
        int n = sc.nextInt();
        System.out.println("Insira a quantidade de colunas da matriz:");
        int t =sc.nextInt();
        int [][] mat = new int[n][t];
        for(int i=0; i <n; i++){
            for(int j=0; j<t; j++){
                System.out.println("Insira o valor da posicao ("+(i+1)+" , "+(j+1)+")");
                mat[i][j]=sc.nextInt();
        }}
        for(int i=0; i <n; i++){
            System.out.println("\n");
            for(int j=0; j <t; j++){
                System.out.print(mat[i][j]+" ");
                
        }}
        System.out.println("\n----------------\nDiagonal Principal");
        for(int i=0; i <n; i++){
                    System.out.print(mat[i][i]+" ");
                
            }
        sc.close();
    }
    
}


