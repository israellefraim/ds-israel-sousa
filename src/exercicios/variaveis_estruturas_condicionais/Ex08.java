package exercicios.variaveis_estruturas_condicionais;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        int dias;
        Scanner input = new Scanner(System.in);

        System.out.println("Complete sua idade em...");

        System.out.print("Anos: ");
        int anos = input.nextInt();
        dias = anos * 365;

        System.out.print("Meses: ");
        int meses = input.nextInt();
        dias += meses * 30;

        System.out.print("Dias: ");
        dias += input.nextInt();

        System.out.println("\nFazem " + dias + " que você nasceu.");

    }
}
