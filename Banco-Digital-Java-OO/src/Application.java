public class Application {
    public static void main(String[] args) {
        Cliente tiago = new Cliente();
        tiago.setNome("Tiago");

        Conta cc = new ContaCorrente(tiago);
        Conta poupanca = new ContaPoupanca(tiago);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
