package aluno;

import java.util.ArrayList;

public class Aluno {
   // atributos ou variáveis de instância
    private int ra;
    private String nome;
    private ArrayList<String> listaDisciplina; // o <String> é o tipo de dado que a lista vai armazenar
    private ArrayList<Double> listaMedia; // nunca pode colocar primitivo, sempre tem que ser o tipo de dado que é a classe

    public Aluno(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.listaDisciplina = new ArrayList<>();
        this.listaMedia = new ArrayList<>();
    }

    //método para receber o nome de uma disciplina  e armazenar na listaDisciplina
    public void matricular(String disciplina){
        listaDisciplina.add(disciplina); // add é um método da classe ArrayList
    }

    // método para receber o nome de uma disciplina e a  média do aluno. inserir a média associada a disciplina na listaMedia
    public void registrarMedia(String disciplina, Double media){
        int index = listaMedia.indexOf(disciplina);
        listaMedia.add(index, media);
    }

    //método para calcular e retornar a média geral do aluno
    public double calcularMediaGeral(){
        double media = 0.0;
        for (Double nota : listaMedia) {
            media += nota;
        }
        return media / listaMedia.size();
    }
}