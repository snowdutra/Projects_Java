import java.util.ArrayList;

public class Aluno {
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

    public void matricular(String disciplina) {
        listaDisciplina.add(disciplina);
    }

    public void registrarMedia(String disciplina, double media) {
        int index = listaDisciplina.indexOf(disciplina);
        listaMedia.add(index, media);
    }

    public double calcularMediaGeral() {
        double soma = 0;
        for (double nota : listaMedia) {
            soma += nota;
        }
        return soma / listaMedia.size();
    }

    public String getNome() {
        return nome;
    }
}

