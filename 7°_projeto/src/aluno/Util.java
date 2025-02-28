package aluno;

import javax.swing.JOptionPane;

public class Util {
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
                // Implement the functionality for each option here
            }
        } while (opcao != 4);
    }
}
