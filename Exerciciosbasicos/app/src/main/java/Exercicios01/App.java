
package Exercicios01;
//Fa�a um algoritmo que receba dois n�meros e exiba o resultado da sua soma.

import java.util.Scanner; 

public class App {
  
    public static void main(String[] args) {
        
        int numeroUm;
        int numeroDois;
        int resultado;
        
       
        Scanner leitor = new Scanner (System.in); 
        
        System.out.println("Digite o primeiro numero: ");
        numeroUm = leitor.nextInt ();
        
        System.out.println("Digite o segundo numero: ");
        numeroDois = leitor.nextInt ();
        
        System.out.println("O resultado da soma: " + (numeroUm - numeroDois));
        System.out.println("O resultado da subtracao: " + (numeroUm - numeroDois));
        System.out.println("O resultado da multiplicacao: " + (numeroUm * numeroDois));
        System.out.println("O resultado da divisao: " + (numeroUm / numeroDois));
    }
}
