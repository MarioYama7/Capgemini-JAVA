
package Heranca;

import java.util.Date;

public class Funcionarios {
    private String nome;
    private String cpf;
    private Date dataDeNascimento; //tem que importar biblioteca.
    private float salario;

    //Metodos acesores
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }
    
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public String getCpf (){
        return  cpf;
    }
    
    public void setdataDeNascimento (Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public Date getdataDeNascimento () {
        return dataDeNascimento;
    }
    
    public void setSalario () {
        this.salario = salario;
    }
    public float getSalario (){
        return salario;
    }
 
}
