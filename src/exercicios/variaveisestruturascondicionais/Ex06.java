package exercicios.variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Preço por litro de combustível: R$");
        float precoGasolina = input.nextFloat();

        System.out.print("Quantidade de km rodados: ");
        float quilometrosRodados = input.nextFloat();

        System.out.print("Consumo médio do veículo (km/l): ");
        float consumoMedio = input.nextFloat();

        float custoTotal = (quilometrosRodados / consumoMedio) * precoGasolina;

        System.out.println("\nO custo total dessa viagem será de R$" + custoTotal);
    }
}
