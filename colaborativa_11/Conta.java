package AtividadesColaborativas.colaborativa_11;

public abstract class Conta {

    private int numero;
    protected double saldo;
    private Cliente titular;

    public abstract void depositar(double valor, Conta cont);

    public abstract boolean sacar(double valor, Conta cont);

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, Cliente titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public Conta(int numero, String nomeTitular, String cpfTitular) {
        this.numero = numero;
        this.titular = new Cliente(nomeTitular, cpfTitular);
        saldo = 0;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta() {
    }

    @Override
    public boolean equals(Object co) {
        if (co.getClass() != this.getClass()) {
            return false;
        }
        return true;
    }
}
