package exercicios.variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário: R$");
        float salarioMensal = input.nextFloat();

        System.out.print("Digite o percentual de ajuste: ");
        float ajusteSalarial = 1 + (input.nextFloat() / 100);

        System.out.println("O novo salário será de " + salarioMensal * ajusteSalarial);
    }
}
