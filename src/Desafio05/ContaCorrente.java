package Desafio05;

public class ContaCorrente extends ContaBancaria{

    //Atributos
    TipoConta tipoConta;

    //construtores

    public ContaCorrente() {

    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo);
        this.tipoConta = tipoConta;
    }


    //Metodos

    @Override
    public void menuBanco(){
        System.out.println("\n ==== Menu conta poupança ====");
        System.out.println(" ");
        System.out.println("Digite o numero da sua opção: ");
        System.out.println("(1).Deposito (2).Saque (3).Ver Saldo");
    }
    @Override
    public void depositar(double valor){
        System.out.println("\n==== Deposito ====");
        System.out.println(" ");
        System.out.println("Deposito Realizado");
        saldo += valor;

    }
    @Override
    public void consultarSaldo(){
        System.out.println("\n==== Saldo ====");
        System.out.println(" ");
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }
    @Override
    public void sacar(double valor){
        System.out.println("\n==== Saque ====");
        System.out.println(" ");
        saldo -= valor;
        System.out.println("Saque Realizado com sucesso");
    }
}

