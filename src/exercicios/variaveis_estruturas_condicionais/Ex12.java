package exercicios.variaveis_estruturas_condicionais;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor do Salário fixo: R$");
        double salarioFixo = input.nextDouble();

        System.out.print("Valor total das vendas: R$");
        double totalVendas = input.nextDouble();

        System.out.print("Comissão por carro vendido: R$");
        float comissaoPorCarro = input.nextFloat();

        System.out.print("Quantidade carros vendidos: ");
        int quantidadeCarros = input.nextInt();

        double salarioFinal = salarioFixo + (quantidadeCarros * comissaoPorCarro) + (totalVendas * 0.05);

        System.out.println("\nSalário final = R$" + salarioFinal);

    }
}
