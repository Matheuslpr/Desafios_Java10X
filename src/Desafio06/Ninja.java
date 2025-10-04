package Desafio06;

import java.util.LinkedList;

public class Ninja implements NinjaInterface{

    // atributos
    private String nome;
    private int idade;
    private String vila;

    // construtores
    public Ninja(String nome,  int idade,String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    //Linkedlist
    LinkedList<Ninja> listDeNinjas = new LinkedList<>();

    public Ninja(){
    listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
    listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
    listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
    listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
    listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
    listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
    listDeNinjas.add(new Ninja("Temari", 18, "Areia"));
    }

    //metodos

    @Override
    public void listarNinjas(){
        if (! listDeNinjas.isEmpty()){
            System.out.println("\n ==== Lista de Ninjas ====");
        } for(Ninja ninja : listDeNinjas){
            System.out.println(ninja);
        }
    }

    @Override
    public void listarNinjas(int indice){
        System.out.println("Ninja do índice " + indice + ": " + listDeNinjas.get(indice));
    }

    @Override
    public void removerNinjas(int indice){
        if (! listDeNinjas.isEmpty()){
            if (indice == 0){
             System.out.println("\n ==== Ninja Removido ====" + listDeNinjas.removeFirst());
            } else if (indice > 0) {
                System.out.println("\n Ninja Removido: " + listDeNinjas.remove(indice));
            }else {
                System.out.println("Erro... entrada invalida.");
            }
        }
    }

    @Override
    public void adicionarNinjas(int indice, String nome, int idade, String vila) {
        if (!listDeNinjas.isEmpty()) {
            if (indice == 0) {
                listDeNinjas.addFirst(new Ninja(this.nome, this.idade, this.vila));
                System.out.println("\nSucesso! Ninja adicionado: " + listDeNinjas.getFirst());
            } else if (indice > 0) {
                listDeNinjas.add(indice, new Ninja(this.nome, this.idade, this.vila));
                System.out.println("\nSucesso! Ninja adicionado: " + listDeNinjas.get(indice));
            } else {
                System.out.println("Erro: entrada inválida.");
            }
        }
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", vila='" + vila + '\'' +
                ", idade=" + idade +
                '}';
    }
}

