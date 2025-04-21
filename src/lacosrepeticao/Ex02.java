package lacosrepeticao;

import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Insira o 1º valor: ");
	    float primeiroValor = input.nextFloat();
	    
	    System.out.print("Insira o 2º valor: ");
	    float segundoValor = input.nextFloat();
	    
	    while (segundoValor == 0) {
	        System.out.println("VALOR INVÁLIDO");
	        System.out.print("Insira novamente o 2º valor (diferente de 0): ");
            segundoValor = input.nextFloat();
	    }
	    
	    double valorDivisao = primeiroValor / segundoValor;
	    
	    System.out.println(primeiroValor + " / " + segundoValor + " = " + valorDivisao);
	}
}