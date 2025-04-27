package exercicios.lacowhile;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float maiorNumero = Float.MIN_VALUE;
        float segundoMaior = Float.MIN_VALUE;

        int i = 0;
        while (i < 10) {
            System.out.print("Insira o " + (i + 1) + "º número: ");
            float v = input.nextFloat();

            if (v > maiorNumero) {
                segundoMaior = maiorNumero;
                maiorNumero = v;
            }
            else if (v > segundoMaior && v < maiorNumero)
                segundoMaior = v;


            i++;
        }

        System.out.println("\nO maior número digitado é " + maiorNumero);
        System.out.println("O segundo maior número digitado é " + segundoMaior);
    }
}
