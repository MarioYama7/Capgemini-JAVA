//O custo de um carro novo ao consumidor � a soma do custo de f�brica mais o
//percentual do distribuidor e dos impostos aplicados (primeiro os impostos 
//s�o aplicados sobre o custo de f�brica, e depois o percentual do distribuidor
//sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os 
//impostos 45%, escreva um algoritmo que leia o custo de f�brica de um carro e
//informe o custo ao consumidor do mesmo;

package Exercicio12;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        
        float custoFabrica;
        float percentualImpostos = 0.45f;
        float valorImpostos;
        float custoDistribuidor = 0.28f;
        float valorDistribuidor;
     
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite o valor de f�brica do ve�culo: ");
    custoFabrica = leitor.nextFloat();
    
    valorImpostos = custoFabrica * percentualImpostos;
    custoFabrica = custoFabrica + valorImpostos;
    
    valorDistribuidor = custoFabrica * custoDistribuidor;
    custoFabrica = custoFabrica + valorDistribuidor;
    
    System.out.println("O valor do custo para o consumidor e: " + custoFabrica);
   
    }
}
