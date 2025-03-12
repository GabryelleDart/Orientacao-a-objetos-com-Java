package ExemploBanco;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] tipodeconta ={ "fazer deposito inicial", "depositar depois"};
        String[] menu ={ "Verificar meus dados", "Modificar meu nome", "Realizar Deposito", "Realizar saque","Sair"};
        int op;
        Conta c;
        double valorinit;

        JOptionPane.showMessageDialog(null, "Bem vindo ao Banco Gaby.", "Página inicial Banco Gaby", 1);
        String nomeTitular=JOptionPane.showInputDialog(null, "Digite seu nome para criar uma conta.", "nome");
        int numeroDaConta =ThreadLocalRandom.current().nextInt(1,10001);
        JOptionPane.showMessageDialog(null, "Seu numero de conta é :"+ String.format("%05d", numeroDaConta));
        int escolha= JOptionPane.showOptionDialog(null,"Voce deseja realizar o deposito inicial?","Saques e depositos",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,tipodeconta,tipodeconta[1]);
        
        if(escolha==0){
            valorinit= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do deposito inicial:"));
            c = new Conta(numeroDaConta,nomeTitular,valorinit);
        }else{
            c = new Conta(numeroDaConta,nomeTitular);
        }
        
        do {
            op= JOptionPane.showOptionDialog(null,"Menu","Area do Cliente",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,menu,menu[4]);
            switch(op){
                case 0:
                    System.out.println(c);
                    break;
                case 1:
                    c.setNomeTitular(nomeTitular=JOptionPane.showInputDialog(null, "Altere o seu nome.", c.getNomeTitular()));
                    JOptionPane.showMessageDialog(null, c);
                    break;
                case 2:
                    c.IncreaseValorinit(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que deseja depositar:")));
                    JOptionPane.showMessageDialog(null, c);
                    break;
                case 3:
                    c.DecreaseValorinit(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que deseja sacar:")));
                    JOptionPane.showMessageDialog(null, c);
                    break;
                case 4:
                    break;
            }
            
        } while (op!=4);

    }
    
}
