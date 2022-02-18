package AtividadesColaborativas.colaborativa_12.CTExercicio02;

public class ContaEspecial extends Conta {
    private double limite;
    public ContaEspecial(int numero,Cliente titular, double limite) {
        super(numero,titular);
        this.limite = limite;
        
    }
    public ContaEspecial(){
        
    }
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
 
    @Override
     public boolean sacar(double valor,Conta cont){
      
       if(cont.getSaldo()>=valor){
           cont.saldo -= valor;      
           return true;
       }
       else{
           return false;
       }
    }
     
     
    
    @Override
     public boolean equals(Object co){
        return co.getClass() == this.getClass();
    }

    @Override
    public void depositar(double valor, Conta cont) {
        this.saldo= this.getSaldo()+valor;
    }
 
}
