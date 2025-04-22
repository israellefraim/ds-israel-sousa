package exercicios.variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade total de eleitores: ");
        int totalEleitores = input.nextInt();

        System.out.print("Quantidade de votos nulos: ");
        int votosNulos = input.nextInt();

        System.out.print("Quantidade de votos brancos: ");
        int votosBrancos = input.nextInt();

        System.out.print("Quantidade de votos válidos: ");
        int votosValidos = input.nextInt();

        System.out.println("\nVotos nulos: " + (int) (votosNulos / (float) totalEleitores * 100) + "%");
        System.out.println("Votos brancos: " + (int) (votosBrancos / (float) totalEleitores * 100) + "%");
        System.out.println("Votos válidos: " + (int) (votosValidos / (float) totalEleitores * 100) + "%");

    }
}