//Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
//que ele obteve no semestre. No final informar o nome do aluno e a sua média 
//(aritmética);
package ExercicioCinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       
        String nomeAluno;
        int provaUm;
        int provaDois;
        int provaTres;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno");
        nomeAluno = leitor.next();
        
        System.out.println("Digite a primeira nota: ");
        provaUm = leitor.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        provaDois = leitor.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        provaTres = leitor.nextInt();
        
        System.out.println("A media do aluno e: " + ((provaUm + provaDois +
                provaTres) / 3));
       
    }
}
