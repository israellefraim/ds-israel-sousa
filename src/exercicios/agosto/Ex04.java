package exercicios.agosto;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.println("Bem vindo ".concat(nome) + "!");
    }
}
