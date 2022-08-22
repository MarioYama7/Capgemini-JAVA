
package Exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        
        int anoVeiculo;
        float valorVeiculo;
        float valorDesconto;
        float valorPagar;
        float porcentagemVeiculo;
        
        int totalSemiNovos = 0;
        int totalVeiculos = 0;
        
        Scanner leitor = new Scanner (System.in);
        
        char desejaRepetir = 's';
                
        while (desejaRepetir == 's' || desejaRepetir=='S') {
       
        System.out.println("Qual o valor do Veiculo? ");
        valorVeiculo = leitor.nextFloat(); 
        
        System.out.println("Informe o ano do Veiculo: ");
        anoVeiculo = leitor.nextInt();
            
        if (anoVeiculo <= 2000) {
            porcentagemVeiculo = 0.12f;
        } else {
            porcentagemVeiculo = 0.07f;  
            totalSemiNovos++;
        }
            totalVeiculos++;
            
        valorDesconto = valorVeiculo * porcentagemVeiculo;
        valorPagar = valorVeiculo - valorDesconto;
        
        System.out.println("O valor de Desconto e: " + valorDesconto);
        System.out.println("O valor a  Pagar e: " + valorPagar);
        
        System.out.println("Deseja Continuar ? S - Sim / N - Nao");
         desejaRepetir = leitor.next().charAt(0);
        } 
        
        System.out.println("O valor total de Semi Novos é: " + totalSemiNovos);
        System.out.println("O total de Veiculos e: " + totalVeiculos);
}
}
    
