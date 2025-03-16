package Lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista= new ArrayList<>();
//esse integer dentro do <> é um generics 
        //parametrização 
        //lista é uma interface logo eu preciso instanciar uma classe que implementa a interface


        //necessario instanciar a alisra
        lista.add("Mary");
        lista.add("Bob");
        lista.add("Carlos");
        lista.add("Michel");
        System.out.println(lista.size());
        lista.add(3,"jose");
        lista.removeIf(x-> x.charAt(0)=='M');
        //isso é uma função lambda
        for(String nomes: lista){
            System.out.println(nomes);
        }
        
    }
    
}
