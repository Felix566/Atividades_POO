package AtividadesColaborativas.colaborativa_11;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    public ContaPoupanca() {

    }

    public void reajustar(double percentual) {

        saldo = saldo + saldo * percentual;
    }

    @Override
    public boolean sacar(double valor, Conta cont) {
        if (cont.getSaldo() >= valor) {
            cont.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object co) {
        return co.getClass() == this.getClass();
    }

    @Override
    public void depositar(double valor, Conta cont) {
        this.saldo = this.getSaldo() + valor;
    }
}
