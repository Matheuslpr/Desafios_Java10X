package Desafio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Scanner
    Scanner scanner = new Scanner(System.in);

    //Construtores
    NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki",18,"Rasengan");
    TipoHabilidade Rasengan = TipoHabilidade.Ninjutsu;

    NinjaBasico RockLee = new NinjaBasico("Rock Lee", 19, "Taijutsu");
    TipoHabilidade Taijutsu = TipoHabilidade.Taijutsu;

    NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha", 19, "Chidori", "Sharingan");
    TipoHabilidade Chidori = TipoHabilidade.Ninjutsu;
    TipoHabilidade Sharingan = TipoHabilidade.Doujutsu;

    NinjaAvancado Pain = new NinjaAvancado("Pain", 35, "8 Caminhos de Pain", "Rinnegan");
    TipoHabilidade CaminhosDePain = TipoHabilidade.Ninjutsu;
    TipoHabilidade Rinnegan = TipoHabilidade.Rinnegan;

    //Loop
    int escolha = 0;

        while(escolha != 3){
            System.out.println("\n==== Menu ====");
            System.out.println("1. Listar Personagens");
            System.out.println("2. Usar Habilidade");
            System.out.println("3. Sair");
            System.out.println("Digite o numero da sua opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 1:
                    Naruto.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade " + Rasengan);
                    System.out.println(" ");
                    RockLee.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade " + Taijutsu);
                    System.out.println(" ");
                    Sasuke.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade " + Chidori);
                    System.out.println("Tipo da Habilidade " + Sharingan);
                    System.out.println(" ");
                    Pain.mostrarInformacoes();
                    System.out.println("Tipo da Habilidade " + CaminhosDePain);
                    System.out.println("Tipo da Habilidade " + Rinnegan);
                    System.out.println(" ");

                    break;
                case 2:
                    System.out.println("\n");
                    Naruto.executarHabilidade();
                    RockLee.executarHabilidade();
                    Sasuke.executarHabilidade();
                    Pain.executarHabilidade();
                    System.out.println(" ");
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