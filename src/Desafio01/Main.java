package Desafio01;

public class Main {
    public static void main(String[] args) {
        String statusDaMissao1;
        String statusDaMissao2;
        String statusDaMissao3;

        //Ninja 1
        String nome = "Naruto Uzumaki";
        int idade = 16;
        String nomeDaMissao = "Procurar gato perdido";
        char nivelDaMissao = 'D';

        //Ninja 2
        String nome2 = "Sasuke Uchiha";
        int idade2 = 17;
        String nomeDaMissao2 = "Recuperar pergaminho de jutsus" ;
        char nivelDaMissao2 = 'S' ;

        //Ninja 3
        String nome3 = "Sakura Haruno";
        int idade3 = 17;
        String nomeDaMissao3 = "Investgar pegadas" ;
        char nivelDaMissao3 = 'C';

        //Missão1

        if (idade > 15 ){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao1 = "Concluido";
            }else{
                statusDaMissao1 = "Não concluido";
            }
        }else {
            statusDaMissao1 = "Concluido";
        }
        //Missão1

        if (idade > 15 ){
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "Concluido";
            }else{
                statusDaMissao2 = "Não concluido";
            }
        }else {
            statusDaMissao2 = "Concluido";
        }

        //Missão3

        if (idade > 15 ){
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D'){
                statusDaMissao3 = "Concluido";
            }else{
                statusDaMissao3 = "Não concluido";
            }
        }else {
            statusDaMissao3 = "Concluido";
        }

        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Nome da Missão: " +nomeDaMissao);
        System.out.println("Rank: " + nivelDaMissao);
        System.out.println("Status da missão: " + statusDaMissao1);
        System.out.println("-------------------------------------");

        System.out.println("Nome do Ninja: " + nome2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Nome da Missão: " +nomeDaMissao2);
        System.out.println("Rank: " + nivelDaMissao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("-------------------------------------");

        System.out.println("Nome do Ninja: " + nome3);
        System.out.println("Idade do Ninja: " + idade3);
        System.out.println("Nome da Missão: " +nomeDaMissao3);
        System.out.println("Rank: " + nivelDaMissao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("-------------------------------------");
    }
}
