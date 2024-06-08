public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && getSaldo() + limite >= valor) {
            super.sacar(valor);
            return true;
        }
        return false;
    }
}


