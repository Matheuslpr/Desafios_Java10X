package Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int index = 0;

        System.out.println("Digite um limite para a listagem de ninja: ");
        int limite = scanner.nextInt();
        scanner.nextLine();
        Ninja[] ninja = new Ninja[limite];


        while(escolha != 3) {
            System.out.println("\n===== Menu ===== ");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninja");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (index == ninja.length){
                        System.out.println("Acabou o espaço na lista");
                    } else{
                        System.out.println("\n Escolha o tipo que deseja cadastrar: ");
                        System.out.println("1. Comum");
                        System.out.println("2. Uchiha");
                        int opcaoTipo = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoTipo){
                            case 1:
                                Ninja novoNinja = new Ninja();
                                System.out.println("\n===== Cadastro Ninja =====");
                                System.out.println("Nome: ");
                                novoNinja.nome = scanner.nextLine();
                                System.out.println("Idade: ");
                                novoNinja.idade = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Missão: ");
                                novoNinja.missao = scanner.nextLine();
                                System.out.println("Dificuldade da Missão: ");
                                novoNinja.nivelDeDificuldade = scanner.nextLine();
                                System.out.println("Status da Missão: ");
                                novoNinja.statusDaMissao = scanner.nextLine();
                                ninja[index] = novoNinja;
                                index++;

                                break;
                            case 2:
                                Uchiha novoUchiha = new Uchiha();
                                System.out.println("\n===== Cadastro Ninja =====");
                                System.out.println("Nome: ");
                                novoUchiha.nome = scanner.nextLine();
                                System.out.println("Idade: ");
                                novoUchiha.idade = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Missão: ");
                                novoUchiha.missao = scanner.nextLine();
                                System.out.println("Dificuldade da Missão: ");
                                novoUchiha.nivelDeDificuldade = scanner.nextLine();
                                System.out.println("Status da Missão: ");
                                novoUchiha.statusDaMissao = scanner.nextLine();
                                System.out.println("Habilidade Especial: ");
                                novoUchiha.habilidadeEspecial = scanner.nextLine();
                                ninja[index] = novoUchiha;
                                index++;

                                break;
                        }

                        break;
                    }
                case 2:
                    System.out.println("\n===== Ninjas Cadastrados ===== ");
                    for (int i = 0; i < ninja.length; i++) {
                        if (ninja[i] != null)
                            ninja[i].mostrarinformacao();
                    }
                    break;

                case 3:
                    System.out.println("Fechando programa...");

                    break;

                default:
                    System.out.println("Opção invalida");
            }

        }
        scanner.close();
    }
}
