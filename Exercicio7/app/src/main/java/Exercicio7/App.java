//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus
//Fahrenheit. A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura
//em Fahrenheit e C a temperatura emCelsius;
package Exercicio7;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
     
    float tempF;
    float tempC;
         
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite a temperatura em Celsius");
    tempC =  leitor.nextFloat();
    
    tempF =(9*tempC+160)/5;
    
    System.out.println("A temperatura em Fahrenheit e: " + tempF);
              
    }
}
