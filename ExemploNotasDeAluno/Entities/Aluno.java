package ExemploNotasDeAluno.Entities;

public class Aluno {
    public String nome;
    public double[] nota = new double[3];
   

    public double Media(){
        return nota[0]+nota[1]+nota[2];
    }
    public void Ap(){
        if(Media()>=60){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado.\nFaltam "+(60-Media())+"pontos." );
        }
    }


}
