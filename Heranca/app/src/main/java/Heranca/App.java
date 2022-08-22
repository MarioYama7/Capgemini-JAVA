
package Heranca;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor ();
        v.setNome("Mário");
        v.setSalario(1000.0f);
        v.setCpf("205112020");
        v.setDataDeNascimento(new Date());
        v.setTotalItensVendiso (10);
        
        System.out.println("O salário do vendedor é: " + v.calcularSalario())
        
        Motorista m = new Motorista ();
        
        v.calcularSalario()
    }
}
