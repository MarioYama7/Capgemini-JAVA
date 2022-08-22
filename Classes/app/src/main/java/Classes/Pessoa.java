
package Classes;

public class Pessoa {
    
    //Atributos
    //O Encapsulamento da classe faz com que outros objetos n�o a utilizem 
    //iretamente
    private float peso;
    private float altura;
    
    
    //M�todo construtor � sempre o mesmo nome da classe
    public Pessoa (){
       System.out.println("Excutando o Medtodo");
    }
    
    public float calcularIMC(){
       
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //M�todos Acessores, que podem ser utilizados diretamente por outros objts
    
    public void setPeso (float peso) {
        this.peso = peso;
    } 
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura (float altura) {
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
}
