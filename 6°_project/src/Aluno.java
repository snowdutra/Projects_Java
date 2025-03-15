
import java.util.ArrayList;

public class Aluno {
    
    // atributos ou variáveis de instância
    private int ra;
    private String nome;
    private ArrayList<String> listaDisciplina;
    private ArrayList<Double> listaMedia;

    // construtor
    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.listaDisciplina = new ArrayList<String>();
        this.listaMedia = new ArrayList<Double>();
    }

    // métodos para receber o nome de uma disciplina e armazenar na lista
    public void matricular(String disciplina) {
        this.listaDisciplina.add(disciplina);
    }

    // métodos para receber o nome de uma disciplina e a média da mesma.
    // inserir a média associada a disciplina
    public void setMedia(String disciplina, double media) {
        int index = this.listaDisciplina.indexOf(disciplina);
        if (index != -1) {
            this.listaMedia.set(index, media);
        }
    }

    // método para calcular a retornar a média geral do aluno
    public double getMediaGeral() {
        double soma = 0.0;
        for (double media : this.listaMedia) {
            soma += media;
        }
        return soma / this.listaMedia.size();
    }

}