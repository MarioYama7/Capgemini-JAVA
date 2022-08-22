//15. Faça um algoritmo que receba um número e diga se este número está no 
//intervalo entre 100 e 200;
package Exercicio15_2;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
     
     Scanner leitor = new Scanner (System.in);
     
     int numero = 0;
     
     System.out.println("Digite um numero: ");
     numero = leitor.nextInt();
     
     if(numero >= 100 && numero <=200){
     System.out.println("O numero esta entre 100 e 200");
     } 
     else{       
     System.out.println("O numero nao esta entre 100 e 200");
      }
    }
}
