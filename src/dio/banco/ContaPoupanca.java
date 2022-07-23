package dio.banco;

public class ContaPoupanca extends Conta{

    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Poupança");
        super.imprimirInfosComuns();
    }

}