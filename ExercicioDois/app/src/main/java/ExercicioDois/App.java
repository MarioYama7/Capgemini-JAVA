//Escreva um algoritmo para determinar o consumo m�dio de um autom�vel sendo 
//fornecida a dist�ncia total percorrida pelo autom�vel e o total de combust�vel
//gasto;
package ExercicioDois;
 
import java.util.Scanner; 

public class App {

    public static void main(String[] args) {
     
        float distanciaTotal;
        float totalCombustivel;
        float consumoMedio;
        int valorGasolina = 7;
        
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite o Distancia total");
    distanciaTotal = leitor.nextFloat();
    
    System.out.println("Digite o total de consumo");
    totalCombustivel = leitor.nextFloat();
    
    consumoMedio = (totalCombustivel / distanciaTotal);
    
    System.out.println ("O consumo medio de combustivel por quilometro e: " + 
    consumoMedio + " Litros de combustivel por KM"); 
    
    System.out.println("O valor gasto por combustivel e: " 
    + (consumoMedio * valorGasolina) );
    
    
}
}