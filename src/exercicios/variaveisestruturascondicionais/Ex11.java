package exercicios.variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Custo de fábrica do carro: R$");
        float custoFabrica = input.nextFloat();

        float custoTotal = (custoFabrica * 1.28f) + (custoFabrica * 0.45f);

        System.out.println("O custo total do carro será de R$" + custoTotal);

    }
}
