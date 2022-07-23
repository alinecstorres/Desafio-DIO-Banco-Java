package dio.banco;

public class ContaCorrente extends Conta {

    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Corrente");
        super.imprimirInfosComuns();
    }


}