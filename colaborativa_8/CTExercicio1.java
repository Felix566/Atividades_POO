package AtividadesColaborativas.colaborativa_8;

public class CTExercicio1 {
    private int numero = 0;
    private String nome_titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void deposita(double valor){
        this.saldo=this.getSaldo()+valor;
    }
    
    boolean sacar(double valor){
        if(this.getSaldo()>=valor){
            this.saldo-=valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public CTExercicio1(String nome_titular, double saldo){
        this.numero = numero++;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }
    
    public CTExercicio1(String nome_titular){
        this.numero = numero++;
        this.nome_titular = nome_titular;
        saldo = 0;
    }
}
