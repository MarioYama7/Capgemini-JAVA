
package Softex01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       
    String nome;
    
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("Qual é o seu nome? ");
    nome = leitor.next();
    
    System.out.println(nome.length());
    
    
    }
}
