package aluguel;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Aluguel {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //System.out.print("Digite a quantidade de quartos: ");
        //int n = sc.nextInt();
        Quarto[] quarto = new Quarto[10];

        for (int i = 0; i < quarto.length; i++) {
            int numeroQuarto = 0;

            System.out.print("Informe o numero do quarto: ");
            numeroQuarto = sc.nextInt();
            if (numeroQuarto < quarto.length) {
                System.out.print("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.next();
                quarto[numeroQuarto] = new Quarto(nome, email);
            } else {
                System.out.println("\nInforme um numero de apartamento entre 0 e 9:");
            }

            System.out.print("\nCadastrar mais?: ");
            String opc = sc.next();

            if ((!"y".equals(opc))) {
                System.out.println("\nAté mais!!\n");
                break;
            }

        }

        for (int i = 0; i < quarto.length; i++) {
            if (quarto[i] != null) {
                System.out.println("Numero do quarto: " + i + ", " + quarto[i].getNome() + ", " + quarto[i].getEmail());
            }
        }
    }

}
