package exercicios.lacos_repeticao;

import java.util.Scanner;

public class Ex15
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valoresAcumulados = 1;
		
		System.out.print("Insira um número inteiro: ");
		int num = input.nextInt();
		
		for (int i = num; i >= 1; i--) {
		    valoresAcumulados *= i;
		}
		
		System.out.println(valoresAcumulados);
	}
}