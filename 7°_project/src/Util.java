

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Util {

    private List<Aluno> listaAluno = new ArrayList<>();

    public void menu() {
        String[] opcoes = {"Cadastrar aluno", "Pesquisar aluno", "Imprimir aluno", "Finalizar"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha opção", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        while (escolha != 3) {
            switch (escolha) {
                case 0:
                    cadastrar();
                    break;
                case 1:
                    pesquisar();
                    break;
                case 2:
                    imprimir();
                    break;
            }
            escolha = JOptionPane.showOptionDialog(null, "Escolha opção", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        }
    }

    private void imprimir() {
        StringBuilder aux = new StringBuilder();
        for(Aluno aluno : listaAluno) {
            aux.append(aluno).append("\n");
        }
        JOptionPane.showMessageDialog(null, aux.toString());
    }

    private void pesquisar() {
        int ra = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA para pesquisa"));
        for (Aluno aluno : listaAluno) {
            if (aluno.getRa() == ra) {
                JOptionPane.showMessageDialog(null, aluno.getNome() + " está matriculado");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, ra + " não encontrado");
    }

    // método para cadastrar um aluno
    private void cadastrar() {
        int ra = Integer.parseInt(JOptionPane.showInputDialog("RA"));
        String nome = JOptionPane.showInputDialog("Nome");
        listaAluno.add(new Aluno(ra, nome));
    }

}

