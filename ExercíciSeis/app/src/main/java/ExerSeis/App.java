//Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores 
//de forma que a variável A passe a possuir o valor da variável B e a variável
//B passe a possuir o valor da variável A .Apresentar osvalores trocados;
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
