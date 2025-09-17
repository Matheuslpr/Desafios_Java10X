package Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja  {

    //Atributos
    String especialidade;

    //Construtores
    public NinjaAvancado(){

    }

    public NinjaAvancado(String nome, int idade, String habilidade,String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    //Metodos
    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: "+ especialidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Meu nome é " + nome + " e a minha habilidade é " + habilidade);
    }
}
