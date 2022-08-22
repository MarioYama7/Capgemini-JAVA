
package Heranca;
  
public class Vendedor extends Funcionarios {
 
    private int totalItensVendidos;
    private float totalComissaoItem;
    
public Vendedor (){
        super ();
}

public float calcularSalario(){
    return super.getSalario() + (this.totalComissaoItem * totalItensVendidos);
     }
    public void setTotalItensVendidos (int totalItensVendidos){
        this.totalItensVendidos = totalItensVendidos;
     }
    public int getTotalItensVendidos (){
        return  totalItensVendidos;
}
     public void setComissaoItem (int totalComissaoItem){
        this.totalComissaoItem = totalComissaoItem;
     }
     public float getTotalComissaoItem (){
        return totalComissaoItem;
     }
}