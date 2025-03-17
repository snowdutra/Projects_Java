public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(123456, "João Silva");

        // Matricular o aluno em disciplinas
        aluno.matricular("Matemática");
        aluno.matricular("Português");
        aluno.matricular("História");

        // Registrar médias para as disciplinas
        aluno.registrarMedia("Matemática", 7.5);
        aluno.registrarMedia("Português", 8.0);
        aluno.registrarMedia("História", 9.0);

        // Exibir informações do aluno
        System.out.printf("RA: %d%n", aluno.getRA()); // Corrigido para getRA()
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Disciplinas: %s%n", aluno.getListaDisciplinas());
        System.out.printf("Médias: %s%n", aluno.getListaMedias());
        System.out.printf("Média Geral: %.2f%n", aluno.getMediaGeral()); // Corrigido para getMediaGeral()
    }
}