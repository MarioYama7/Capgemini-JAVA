
package EstruturaFor;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        int i;
        for (int = 0; int <=10; i = 1 + 1){   
    }
    
        int totalAlunos = 10;
        Scanner leitorScanner = new Scanner (System.in);
        
        while (totalAlunos >0){
        String nomeAluno = leitorScanner.nextLine();
        int idadeAluno = leitorScanner.nextLine();
        
        System.out.println("O Nome do Aluno e:" + nomeAluno + 
                "A idade do aluno e: " + idadeAluno);
        
        totalAlunos = totalAlunos -1;        
        }        
    }
}
