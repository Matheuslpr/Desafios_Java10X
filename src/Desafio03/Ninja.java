package Desafio03;

public class Ninja {
    //atributos
    String nome;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;
    int idade;

    //metodos

    public void mostrarinformacao(){
        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println(" ");
    }
}
