
package Exercicio24;

import java.util.Scanner;
public class App {
       
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar ='S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's') {
        System.out.println("Digite um numero:");
        int numero = leitorScanner.nextInt();
        
        if (numero == 0) {
            System.out.println("O numero e 0");
        }
        else {
            if (numero > 0){
                System.out.println("O numero e maior que 0");
            }
            else {
                System.out.println("O numero e menor que 0");
            }
            System.out.println("Deseja Continuar? S - Sim / N - Nao");
        desejaContinuar = leitorScanner.next().charAt(0);  
        }       
    }       
    }      
}
