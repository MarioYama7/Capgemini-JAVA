//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com 
//rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m;
package Exercicio9;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float valor;
        float juros = 0.07f;
        float valorFinal;
        
    Scanner leitor = new Scanner(System.in);
     
    System.out.println("Digite o valor depositado");
    valor = leitor.nextFloat();
    
    valorFinal = valor + (valor * juros);
            
    System.out.println("O valor resgatado apos um mes e: " + valorFinal);
    }
}
