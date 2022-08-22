//Escreva um algoritmo que *leia o nome de um vendedor*, o *seu salário fixo*
//e o *total de vendas efetuadas* por ele no mês (em dinheiro). Sabendo que este 
//vendedor ganha *15%* de comissão sobre suas vendas efetuadas, informar o seu 
//nome, o salário fixo e salário no final do mês;
package ExercicioQuatro;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            
        String nomeVendedor;
        float totalVendas;
        float salarioFixo;
        float porcentagemComissao = 0.15f;
        float valorComissao;
        float salarioFinal;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = leitor.next();
        
        System.out.println("Digite o total de Vendas: ");
        totalVendas = leitor.nextFloat();
        
        System.out.println("Digite seu salario fixo");
        salarioFixo = leitor.nextFloat();
        
        
        
        valorComissao = (totalVendas * porcentagemComissao);
        
        salarioFinal = (salarioFixo + valorComissao);
        
        System.out.println(("O nome do vendedor e: ") + nomeVendedor);
        System.out.println(("O se salario fixo e: ") + salarioFixo);
        System.out.println(("O seu salario final e:") + salarioFinal);    
    }
}
