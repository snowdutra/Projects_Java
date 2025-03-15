
import java.util.ArrayList;

public class Aluno {
    // atributos ou variáveis de instância
    private int ra;
    private String nome;
    private ArrayList<String> listaDisciplina;
    private ArrayList<Double> listaMedia;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.listaDisciplina = new ArrayList<>();
        this.listaMedia = new ArrayList<>();
    }

    // método para receber o nome de uma disciplina e armazenar na lista
    public void matricular(String disciplina) {
        listaDisciplina.add(disciplina);
    }

    // método para receber o nome de uma disciplina e a média da mesma.
    // inserir a média associada a disciplina
    public void registrarMedia(String disciplina, double media) {
        int index = listaDisciplina.indexOf(disciplina);
        listaMedia.add(index, media);
    }

    // método para calcular e retornar a média geral do aluno
    public double calcularMediaGeral() {
        double soma = 0.0;
        for (double nota : listaMedia) {
            soma += nota;
        }
        return soma / listaMedia.size();
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append("RA: ").append(ra).append("\n");
        aux.append("Nome: ").append(nome);
        return aux.toString();
    }
}
