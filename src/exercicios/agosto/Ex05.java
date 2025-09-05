package exercicios.agosto;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();

        System.out.print("Insira sua altura (m): ");
        double altura = input.nextDouble();

        System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }
}
