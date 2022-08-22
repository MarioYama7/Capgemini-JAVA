
package Exercicio15;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
     
    int numero;
    Scanner leitorScanner = new Scanner(System.in);
    System.out.println("Digite um numero/valor ");
    numero = leitorScanner.nextInt();
    
    if (numero >=100 && numero <=200){
       System.out.println("Numero dentro do intervalo");
    }
    else{
        System.out.println("Numero fora do intervalo");
    }
     
    }
}
