//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
//durante o semestre. Calcular a sua média (aritmética), informar o nome e
//sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação 
//(media entre 5.1 a 6.9);

package Exercicio16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
Scanner leitor = new Scanner(System.in);

String nome;
double nota01;
double nota02;
double nota03;
double media;

System.out.println("Digite seu nome: ");
nome = leitor.next();

System.out.println("Informe sua nota 01");
nota01 = leitor.nextDouble();

System.out.println("Informe sua nota 02");
nota02 = leitor.nextDouble();

System.out.println("Informe sua nota 03");
nota03 = leitor.nextDouble();

media = (nota01 + nota02 + nota03) / 3;

System.out.printf("O aluno" + nome + "teve media nas notas de:%.2f", media);
System.out.println(" ");

if (media >= 7){
        System.out.println("Aluno(a) aprovado(a)");
        } else  
        System.out.println("Aluno(a) Reprovado(a)");
    }
}
