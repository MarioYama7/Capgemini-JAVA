//Faça um algoritmo que receba o preço de custo de um produto e mostre o valor
//de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um
//percentual informado pelo usuário;
package Exercicio11;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
    float precoCusto;
    float acrescimo;
    float precoVenda;
        
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um valor de custo: ");
    precoCusto = leitor.nextFloat();
    
    System.out.println("Digite uma porcentagem de acrescimo: ");
    acrescimo = leitor.nextFloat();
    
    precoVenda = precoCusto + (precoCusto * acrescimo);
    
    System.out.println("O valor de venda e: " + precoVenda);
    }
}
