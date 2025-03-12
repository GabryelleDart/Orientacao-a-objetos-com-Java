package ExemploNotasDeAluno.Application;

import java.util.Scanner;

import ExemploNotasDeAluno.Entities.Aluno;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Insira o nome do aluno :");
        aluno.nome=sc.nextLine();
        for(int i=0; i<=2;i++){
            System.out.println("Insira a nota do aluno "+ aluno.nome+" do "+ (i+1) +"° trimestre :");
            aluno.nota[i]= sc.nextDouble();
            if((i==0 && aluno.nota[i]>30)||(i>=1 && aluno.nota[i]>35)){
                System.out.println("Nota invalida.\nInsira a nota do aluno "+ aluno.nome+" do "+ (i+1) +"° trimestre novamente :");
                aluno.nota[i]= sc.nextDouble();
            }
        }
        System.out.println("Nota final :"+ aluno.Media());
        aluno.Ap();
        sc.close();
    }
    
}
