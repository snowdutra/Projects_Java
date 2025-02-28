package aluno;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Util {
    
    private List<Aluno> listaAluno = new ArrayList<>();

    public void menu() {
        String aux = "Escolha uma opção: \n";
        aux += "1. Cadastrar Aluno\n";
        aux += "2. Pesquisar Aluno\n";
        aux += "3. Imprimir Aluno\n";
        aux += "4. Finalizar\n";
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, aux));
            if (opcao < 1 || opcao > 4) {
                JOptionPane.showMessageDialog(null, "Opção inválida");
            } else {
                switch (opcao) { 
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        pesquisarAluno();
                        break;
                    case 3:
                        imprimirAluno();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Finalizando o programa.");
                        break;
                }
            }
        } while (opcao != 4);
    }

    private void cadastrarAluno() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
        int ra = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ra do aluno: "));
        Aluno aluno = new Aluno(ra, nome);
        listaAluno.add(aluno);
    }

    private void pesquisarAluno() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
        boolean encontrado = false;
        for (Aluno aluno : listaAluno) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Aluno encontrado: " + aluno.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
        }
    }

    private void imprimirAluno() {
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : listaAluno) {
            sb.append(aluno.toString());
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}

