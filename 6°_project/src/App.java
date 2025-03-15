public class App {
    public static void main(String[] args) {
        // Criação de um aluno
        Aluno aluno = new Aluno(12345, "João Silva");

        // Matriculando o aluno em disciplinas
        aluno.matricular("Matemática");
        aluno.matricular("Português");
        aluno.matricular("História");

        // Registrando médias das disciplinas
        aluno.setMedia("Matemática", 8.5);
        aluno.setMedia("Português", 7.0);
        aluno.setMedia("História", 9.0);

        // Calculando a média geral do aluno        
        double mediaGeral = aluno.getMediaGeral();
        System.out.println("Média geral do aluno: " + mediaGeral);
    }
}