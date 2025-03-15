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

    // método para calcular e retornar a média geral do aluno
    public double getMediaGeral() {
        double soma = 0.0;
        for (double media : this.listaMedia) {
            soma += media;
        }
        return soma / this.listaMedia.size();
    }

    // método para retornar o RA do aluno
    public int getRA() {
        return this.ra;
    }

    // método para retornar o nome do aluno
    public String getNome() {
        return this.nome;
    }

    // método para retornar a lista de disciplinas do aluno
    public ArrayList<String> getListaDisciplinas() {
        return this.listaDisciplina;
    }

    // método para retornar a lista de médias do aluno
    public ArrayList<Double> getListaMedias() {
        return this.listaMedia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RA: ").append(this.ra).append("\n");
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("Disciplinas: ").append(this.listaDisciplina).append("\n");
        sb.append("Médias: ").append(this.listaMedia).append("\n");
        return sb.toString();
    }

}
