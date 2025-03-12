package ExemploBanco;

public class Conta {
    private int numeroDaConta;
    private String nomeTitular;
    private double valorinit;
    
    public Conta(int numeroDaConta, String nomeTitular, double valorinit) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.valorinit = valorinit;
    }

    public Conta(int numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorinit() {
        return valorinit;
    }

    public void DecreaseValorinit(double nmr){
        this.valorinit+=(nmr-5);
    }
    public void IncreaseValorinit(double nmr){
        this.valorinit+=nmr;
    }

    @Override
    public String toString() {
        return "Conta : " + numeroDaConta + "\nTitular : " + nomeTitular + "\nSaldo :" + valorinit
                ;
    }
    

}
