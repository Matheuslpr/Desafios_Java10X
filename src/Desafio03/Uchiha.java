package Desafio03;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostarHabilidadeEspecial() {
        System.out.println("Habilidade especial:" + habilidadeEspecial);
    }
    @Override
    public void mostrarinformacao(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao);
    }
}
