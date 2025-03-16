package Entities;

import Enuns.Dispensa;


//numero de tombo é o numero do exemplar
public class Exemplar{
    private int numeroTombo;
    private String titulo;
    private String autoria;
    private Dispensa disp;
    private int quanEmpres;

    public Exemplar(int numeroTombo, String titulo, String autoria, Enum dips) {
        this.numeroTombo = numeroTombo;
        this.titulo = titulo;
        this.autoria = autoria;
        this.disp = disp;
    }

    public void habilitarEmprestimo(){
        this.disp= disp.DISPENSAVEL; 
    }
    public void desabilitarEmprestimo(){
        this.disp= disp.INDISPENSAVEL;
    }
    public void adicionarEmprestimo(){
        quanEmpres+=1;
    }

    public int getNumeroTombo() {
        return numeroTombo;
    }

    public void setNumeroTombo(int numeroTombo) {
        this.numeroTombo = numeroTombo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutoria() {
        return autoria;
    }

    public void setAutoria(String autoria) {
        this.autoria = autoria;
    }

    public Dispensa getDisp() {
        return disp;
    }


    public int getQuanEmpres() {
        return quanEmpres;
    }

    @Override
    public String toString() {
        return "Exemplar\nnumeroTombo=" + numeroTombo + ", titulo=" + titulo + ", autoria=" + autoria + ", disp=" + disp
                + ", quanEmpres=" + quanEmpres ;
    }
    
   

   



}