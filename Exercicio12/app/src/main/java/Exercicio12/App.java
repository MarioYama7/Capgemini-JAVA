//O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o
//percentual do distribuidor e dos impostos aplicados (primeiro os impostos 
//são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor
//sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os 
//impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e
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
    
    System.out.println("Digite o valor de fábrica do veículo: ");
    custoFabrica = leitor.nextFloat();
    
    valorImpostos = custoFabrica * percentualImpostos;
    custoFabrica = custoFabrica + valorImpostos;
    
    valorDistribuidor = custoFabrica * custoDistribuidor;
    custoFabrica = custoFabrica + valorDistribuidor;
    
    System.out.println("O valor do custo para o consumidor e: " + custoFabrica);
   
    }
}
