import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);

    public void menu() {
        int opcao;

        do {
            System.out.println("1. Somar");
            System.out.println("2. Dividir");
            System.out.println("3. Finalizar");
            opcao = sc.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
            } else {
                switch (opcao) {
                    case 1:
                        somar();
                        break;
                    case 2:
                        dividir();
                        break;
                    default:
                        System.out.println("Finalizando o programa.");
                        break;
                }
            }
        } while (opcao != 3);

    }

    private void somar() {
       System.out.println("somar ");
    }

    private void dividir() {
        System.out.println("dividir ");
    }

}

