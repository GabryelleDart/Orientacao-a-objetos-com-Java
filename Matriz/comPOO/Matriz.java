package Matriz.comPOO;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public int[] [] dados;
    public int s=0;

    
    public Matriz(int linhas, int colunas) {
        dados = new int [linhas][colunas];
    }
    public void LeDados(Scanner sc){
            for(int i=0; i<dados.length;i++){
                for(int j=0; j<dados[i].length;j++){
                    System.out.println("Insira o valor da posicao ("+(i+1)+" , "+(j+1)+")");
                    dados[i][j]=sc.nextInt();
                    if(dados[i][j]<0){
                        s++;
                    }
        }


    }
    }
    public String Diagonal() {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<dados.length;i++){
           sb.append(dados[i][i] ).append(" " );
        }
      return sb.toString();

    }

    
    @Override
    public String toString() {
        return "Matriz:\n" + Arrays.deepToString(dados).replace("]","]\n") + "\n-----------\n" +"Diagonal Principal:" + Diagonal() + "\n-----------\n" +"Numeros Inpares:"+s;

   
    }
}
