package variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o seu salário: ");
        float salario = input.nextFloat();

        System.out.println("Digite quanto você faturou em vendas no mês: ");
        float vendas = input.nextFloat();

        System.out.println("Nome: " + nome + "\nSalário: " + salario + "\nSalário final: " + (vendas * 0.15 + salario));
    }
}