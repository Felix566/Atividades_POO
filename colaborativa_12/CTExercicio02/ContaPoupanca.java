package AtividadesColaborativas.colaborativa_12.CTExercicio02;

public class ContaPoupanca extends Conta implements Investimento {

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    public ContaPoupanca() {

    }

    @Override
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
