import dio.banco.Cliente;
import dio.banco.ContaCorrente;
import dio.banco.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();
        Cliente cliente = new Cliente();

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cliente.imprimirNomeCliente();

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
    }

}