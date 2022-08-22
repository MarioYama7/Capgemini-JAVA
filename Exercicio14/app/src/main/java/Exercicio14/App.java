//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual 
//é o maior;
package Exercicio14;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);
    
    int numeroUm;
    int numeroDois;
    
    System.out.println("Digite o primeiro numero: ");
    numeroUm = leitor.nextInt();
    
    System.out.println("Digite o segundo numero: ");
    numeroDois = leitor.nextInt();
    
    if (numeroUm > numeroDois) {
        System.out.println("O numero maior e: " + numeroUm);
    }else {
        System.out.println("O numero maior e: " + numeroDois);
    }  
    }
}
