import java.util.Scanner;

public class AnaliseGenes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] gene;
        int x = 0;

        System.out.print("Gene que você quer analisar (letra única): ");
        String genePrincipal = input.nextLine().toUpperCase();

        System.out.print("Quantidade de genes a serem analisados: ");
        int quantidadeGenes = input.nextInt();
        input.nextLine();
        gene = new String[quantidadeGenes];

        for (int i = 0; i < quantidadeGenes; i++) {
            System.out.print("\033[1mInsire o valor do " + (i+1) + "º gene: \033[m");
            gene[i] = input.nextLine().toUpperCase();

            if (genePrincipal.equals(gene[i])) {
                x++;
            }

        }
        if (x > 1) {
            System.out.println("\033[1;3;96mAchei o danado.\033[m");
        }
        else if (x == 1) {
            System.out.println("\033[1;3;95mAinda não é o suficiente.\033[m");
        }
        else {
            System.out.println("\033[1;3;93mSumiuu!");
        }
    }
}