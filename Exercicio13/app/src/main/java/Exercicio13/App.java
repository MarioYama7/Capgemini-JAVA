//Faça um algoritmo que receba um número e mostre uma mensagem caso este número
//seja maior que 10;
package Exercicio13;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);
    
    int numero;
    
    System.out.println("Digite um numero");
    numero = leitor.nextInt();
    
    if (numero > 10){
    System.out.println("Numero maior que 10");
    }else {
    System.out.println("Numero nao e maior que 10");    
    }
    }
}
