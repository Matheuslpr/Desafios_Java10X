package Desafio05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Construtores
        ContaCorrente contaCorrente = new ContaCorrente(0,TipoConta.CORRENTE);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0,TipoConta.POUPANCA);

        //Loop
        int escolha = 0;

        while(escolha != 3){
            System.out.println("\n==== Menu ====");
            System.out.println("1. Conta Poupaça");
            System.out.println("2. Conta Corrente");
            System.out.println("3. Sair");
            System.out.println("Digite o numero da sua opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 1:
                    contaPoupanca.menuBanco();
                    int opcaoPoupanca = scanner.nextInt();

                    if (opcaoPoupanca == 1){
                        System.out.println("\n==== Deposito ====");
                        System.out.println(" ");
                        System.out.println("Qual o valor que deseja depositar: ");
                        double valor = scanner.nextDouble();
                        contaPoupanca.depositar(valor);

                    }else if (opcaoPoupanca == 2){
                        System.out.println("\n==== Saque ====");
                        System.out.println(" ");
                        double valor = scanner.nextDouble();
                        contaPoupanca.sacar(valor);

                    }else if (opcaoPoupanca == 3){
                        contaPoupanca.consultarSaldo();

                    }else {
                        System.out.println("Digite uma opção válida....");
                    }
                    break;
                case 2:
                    contaCorrente.menuBanco();
                    int opcaoCorrente = scanner.nextInt();

                    if (opcaoCorrente == 1){
                        System.out.println("\n==== Deposito ====");
                        System.out.println(" ");
                        System.out.println("Qual o valor que deseja depositar: ");
                        double valor = scanner.nextDouble();
                        contaCorrente.depositar(valor);

                    }else if (opcaoCorrente == 2){
                        System.out.println("\n==== Saque ====");
                        System.out.println(" ");
                        double valor = scanner.nextDouble();
                        contaCorrente.sacar(valor);

                    }else if (opcaoCorrente == 3){
                        contaCorrente.consultarSaldo();

                    }else {
                        System.out.println("Digite uma opção válida....");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema.....");
                    break;

                default:
                    System.out.println("Digite uma opção válida....");
                    break;
            }
        }
        scanner.close();
    }
}
