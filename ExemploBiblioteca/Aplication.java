import java.util.Scanner;

import Entities.Exemplar;
import Enuns.Dispensa;

public class Aplication {
    public static void main(String[] args) {
        Dispensa dis=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do livro.");
        String titulo =sc.nextLine();
        System.out.println("Insira o nome dos autores.");
        String autoria =sc.nextLine();
        System.out.println("Insira o numero de tombo.");
        int numeroTombo =sc.nextInt();
        System.out.println("Ele está habilitado para emprestimo? Digite 1 para habilitado e 2 para desabilitado.");
        int dec =sc.nextInt();
        if(dec==1){
           dis= Dispensa.DISPENSAVEL;
        }else if(dec==2){
          dis= Dispensa.INDISPENSAVEL;
        }else{
            System.out.println("Valor inválido");
        }
        Exemplar one =new Exemplar(numeroTombo, titulo, autoria, dis);
        System.out.println(one);
        sc.close();
    }
    
}
