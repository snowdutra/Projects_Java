import javax.swing.JOptionPane;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAluno = new ArrayList<>();

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                "1 - Cadastrar aluno\n2 - Matricular aluno\n3 - Cadastrar média\n4 - Sair"
            );
            int opcaoEscolhida = Integer.parseInt(opcao);

            switch (opcaoEscolhida) {
                case 1:
                    int ra = Integer.parseInt(JOptionPane.showInputDialog("RA"));
                    String nome = JOptionPane.showInputDialog("Nome");
                    listaAluno.add(new Aluno(ra, nome));
                    break;
                case 2:
                    int raMatricula = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno"));
                    String disciplina = JOptionPane.showInputDialog("Disciplina");
                    for (Aluno aluno : listaAluno) {
                        if (aluno.getRa() == raMatricula) {
                            aluno.matricular(disciplina);
                            break;
                        }
                    }
                    break;
                case 3:
                    int raMedia = Integer.parseInt(JOptionPane.showInputDialog("RA do aluno"));
                    String disciplinaMedia = JOptionPane.showInputDialog("Disciplina");
                    double media = Double.parseDouble(JOptionPane.showInputDialog("Média"));
                    for (Aluno aluno : listaAluno) {
                        if (aluno.getRa() == raMedia) {
                            aluno.registrarMedia(disciplinaMedia, media);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
}
