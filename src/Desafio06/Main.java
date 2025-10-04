package Desafio06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ninja listDeNinjas = new Ninja();
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        int opcao, indice;

        //loop
        while(escolha != 4){
            System.out.println("\n===== MENU DE NINJAS =====");
            System.out.println("1. Listar personagens");
            System.out.println("2. Adicionar um personagem");
            System.out.println("3. Remover um personagem");
            System.out.println("4. Sair");
            System.out.print("Digite o numero da sua opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\n===== LISTAGEM DE NINJAS =====");
                    System.out.println(" ");
                    System.out.println("1. Listagem geral");
                    System.out.println("2. Listagem por índice");
                    System.out.print("Digite o numero da sua opção: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.println("\n=====LISTAGEM GERAL=====");
                            listDeNinjas.listarNinjas();
                            break;

                        case 2:
                            System.out.println("\n=====LISTAGEM POR ÍNDICE=====");
                            System.out.print("Digite o índice do ninja: ");
                            indice = scanner.nextInt();
                            scanner.nextLine();
                            listDeNinjas.listarNinjas(indice);
                            break;

                        default:
                            System.out.println("\nEntrada inválida... Digite novamente.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n======ADICIONANDO NOVO NINJA======");
                    System.out.println("Em qual índice você deseja adicioná-lo?");
                    System.out.print("Digite aqui: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("\nDigite o nome do ninja: ");
                    listDeNinjas.setNome(scanner.nextLine());

                    System.out.print("Digite a idade do ninja: ");
                    listDeNinjas.setIdade(scanner.nextInt());
                    scanner.nextLine();

                    System.out.print("Digite a vila do ninja: ");
                    listDeNinjas.setVila(scanner.nextLine());
                    listDeNinjas.adicionarNinjas(indice, listDeNinjas.getNome(), listDeNinjas.getIdade(), listDeNinjas.getVila());
                    break;

                case 3:
                    System.out.println("\n====== REMOVENDO NINJAS ======");
                    System.out.println("Qual o índice do ninja a ser removido?");
                    System.out.print("Digite aqui: ");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                    listDeNinjas.removerNinjas(indice);
                    break;

                case 4:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    System.out.println("\nEntrada inválida... Digite novamente.");
                    break;
            }
        }
        scanner.close();
    }
}