//Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real
//(R$) de um valorlido em d�lar (US$). O algoritmo dever� solicitar o valor da 
//cota��o do d�lar e tamb�m aquantidade de d�lares dispon�veis com ousu�rio;
package Exercicio8;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
    float real;
    float dolar;
    float cota;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite o valor em real: ");
    real = leitor.nextFloat();
    
    System.out.println("Digite o valor em real: ");
    real = leitor.nextFloat();
    
    dolar = real * cota;
    System.out.println("o valor em dolar e: " + dolar); 
    }
}
