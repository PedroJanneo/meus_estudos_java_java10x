package NivelIntermediario.Desafios.Desafio5;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaCorrente(120);
        conta1.depositar(10);

        System.out.println("saldo atual: " + conta1.consultarSaldo());

        ContaBancaria conta2 = new ContaPoupanca(110);
        conta2.depositar(121);

        System.out.println("Saldo atual: " + conta2.consultarSaldo());
    }
}
