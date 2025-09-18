package Desafio05;

public abstract class ContaBancaria implements Conta {

    //Atributos
    double saldo;

    //Construtores
    public ContaBancaria(){

    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Metodos
    public void consultarSaldo(){

    }
    public abstract void depositar(double valor);

    public abstract void menuBanco();

    public abstract void sacar(double valor);

}
