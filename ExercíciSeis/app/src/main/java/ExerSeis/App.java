//Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores 
//de forma que a vari�vel A passe a possuir o valor da vari�vel B e a vari�vel
//B passe a possuir o valor da vari�vel A .Apresentar osvalores trocados;
package ExerSeis;
  import java.util.Scanner;
public class App {
    
    public static void main(String[] args) { 
        
        int a;
        int b;
        
    
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("Digite o valor para A: ");
    a = leitor.nextInt();
    
    System.out.println("Digite o valor para B: ");
    b = leitor.nextInt();
    
    a = a^b;
    b = b^a;
    a = a^b;
    
    System.out.println("O valor de A e: " + a);
    System.out.println("O valor de B e: " + b);
    
    }
}
