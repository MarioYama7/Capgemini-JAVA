//A Loja Mam�o com A��car est� vendendo seus produtos em 5(cinco)presta��es sem 
//juros. Fa�a um algoritmo que receba um valor de uma compra e mostre o valor
//das presta��es;
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
