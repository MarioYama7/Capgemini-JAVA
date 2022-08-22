
package Exercicios;

import java.util.Scanner;//chamar a biblioteca do scanner

public class E22 {
    public static void main(String[] args) { // estrutura principal
        
        String nomeProduto;
        float valorProduto; //variavel para utilizar os dados
        float valorVenda; //variavel para utilizar os dados
        
        //valores de total de custo tem que atribuir um valor inicial
        float totalCusto;
        totalCusto = 0.0f; //variavel acumuladora de dados
        float totalVenda;
        totalVenda = 0.0f; //variavel acumuladora de dados

        Scanner leitor = new Scanner(System.in); //chamar o scanner
     

        int  i = 0; //só pra separar o valor de i e informar que ele é inteiro, 
        //colocar o ":" repetido na função de baixo pra indicar continuidade.
        // o "i" é uma variável de controle. Para pegar toda a clas, utilizar
        //fora do for
        for (; 3 >= i; i++) { //função equivalente ao "Para" do Portugol

        System.out.println("Digite o nome do Produto");
        nomeProduto = leitor.next();

        System.out.println("Digite o valor de custo do Produto");
        valorProduto = leitor.nextFloat();

        System.out.println("Digite o valor de venda do Produto");
        valorVenda = leitor.nextFloat();

        totalCusto = totalCusto + valorProduto;
        totalVenda = totalVenda + valorVenda;

            if(valorProduto == valorVenda){
                System.out.println("Houve um ponto de equilibrio");
            } else {
                if (valorProduto > valorVenda){
                    System.out.println("Houve um Prejuizo");
                }
                 else {
                    System.out.println("Houve um Lucro");
                }
            }
            
        System.out.println(nomeProduto + ", preço do produto e: " + valorProduto + 
                ", valor de venda e: " + valorVenda);
        }

        System.out.println("A media do preco de custo e de: " + totalCusto / i);
        System.out.println("A media do preco de venda e de: " + totalVenda /i);
    }     
}

