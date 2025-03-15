public class App {
    public static void main(String[] args) {
        // Criação de um aluno
        Aluno aluno = new Aluno(123456, "João Silva");

        // Matriculando o aluno em disciplinas
        aluno.matricular("Matemática");
        aluno.matricular("Português");        
        aluno.matricular("História");

        // Definindo as médias para as disciplinas
        if (aluno.getListaDisciplinas().size() > 0) {
            int index = aluno.getListaDisciplinas().indexOf("Matemática");
            if (index != -1) {
                aluno.setMedia("Matemática", 7.5);
            }
            index = aluno.getListaDisciplinas().indexOf("Português");
            if (index != -1) {
                aluno.setMedia("Português", 8.0);
            }
            index = aluno.getListaDisciplinas().indexOf("História");
            if (index != -1) {
                aluno.setMedia("História", 9.0);
            }
        }

        // Exibindo as informações do aluno
        System.out.println("RA: " + aluno.getRA());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Disciplinas: " + aluno.getListaDisciplinas());
        System.out.println("Médias: " + aluno.getListaMedias());
        System.out.println("Média Geral: " + aluno.getMediaGeral());
    }
}

