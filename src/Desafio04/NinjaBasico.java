package Desafio04;

import java.sql.SQLOutput;

public class NinjaBasico implements Ninja{

    //Atributos
    String nome;
    int idade;
    String habilidade;

    //Construtores
    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    //Metodos
    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Meu nome é " + nome + " e a minha habilidade é " + habilidade);
    }
}
