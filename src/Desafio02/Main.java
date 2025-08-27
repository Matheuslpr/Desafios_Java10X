package Desafio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limite;
        int opcao = 0;
        String nome;
        int ninjasCadastrados = 0;

        System.out.println("Quantos ninjas você deseja cadastrar?");
        limite = scanner.nextInt();
        String[] ninjas = new String[limite];


        while (opcao != 3 ) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados == ninjas.length) {
                        System.out.println("A lista de ninjas esta lotada");
                    } else {
                        System.out.println("Digite o nome do Ninja que deseja cadastrar: ");
                        nome = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nome;
                        ninjasCadastrados++;
                        break;
                    }
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Não existe ninjas na lista");
                    } else {
                        System.out.println("Lista de ninjas cadastrados: ");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa.... por favor aguarde!");
                    break;
                default:
                    System.out.println("Você não digitou uma opção valida... por favor tente novamente!");
            }
        }

        scanner.close();
    }
}
