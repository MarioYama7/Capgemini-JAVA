
package Exer_Gil;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
       
    String nome01 = "mestre do universo";
    String nome02;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um nome para a variavel nome02:");
    nome01 = leitor.next();
    
    nome01 = "Mário";
    nome02 = " Henrique";
    
    System.out.println("Os novos valores das variaveis são: " + nome01 + nome02);
     
        }
}
