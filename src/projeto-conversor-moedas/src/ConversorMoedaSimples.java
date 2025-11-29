import java.util.Scanner;

public class ConversorMoedaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double taxaDolar = 5.60;
        double taxaEuro = 6.10;

        System.out.println("=== Conversor de Moedas ===");
        System.out.print("Informe o valor em reais: ");
        double valor = input.nextDouble();

        double emDolar = valor / taxaDolar;
        double emEuro = valor / taxaEuro;

        System.out.printf("Valor em Dólar: %.2f%n", emDolar);
        System.out.printf("Valor em Euro: %.2f%n", emEuro);

        input.close();
    }
}