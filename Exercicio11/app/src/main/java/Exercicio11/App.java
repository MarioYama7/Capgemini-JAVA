//Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor
//de venda. Sabe-se que o pre�o de custo receber� um acr�scimo de acordo com um
//percentual informado pelo usu�rio;
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
