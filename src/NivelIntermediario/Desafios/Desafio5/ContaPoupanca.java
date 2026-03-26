package NivelIntermediario.Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor * 0.99;
    }
}
