public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345-6", 1000.0);
        ContaPoupanca cp = new ContaPoupanca("78901-2");

        cc.depositar(500.0);
        cp.depositar(300.0);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        cc.sacar(100.0);
        System.out.println("Saldo CC após saque: " + cc.getSaldo());

        cc.transferir(200.0, cp);
        System.out.println("Saldo CC após transferência: " + cc.getSaldo());
        System.out.println("Saldo CP após recebimento: " + cp.getSaldo());
    }
}
