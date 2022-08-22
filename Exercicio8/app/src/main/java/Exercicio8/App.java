//Elabore um algoritmo que efetue a apresentação do valor da conversão em real
//(R$) de um valorlido em dólar (US$). O algoritmo deverá solicitar o valor da 
//cotação do dólar e também aquantidade de dólares disponíveis com ousuário;
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
