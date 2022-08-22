//A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem 
//juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor
//das prestações;
package Exercicio10;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
    float valorProduto;
    float valorPrestacao;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digito o valor do produto");
    valorProduto = leitor.nextFloat();
    
    valorPrestacao = valorProduto / 5;
    
    System.out.println("O valor das prestacoes e: " + valorPrestacao); 
    }
}
