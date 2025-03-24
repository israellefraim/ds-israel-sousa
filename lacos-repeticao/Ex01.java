import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Insira o 1º valor: ");
	    float primeiroValor = input.nextFloat();
	    
	    float segundoValor;
	    
	    do {
	        System.out.print("Insira o 2º valor (diferente de 0): ");
	        segundoValor = input.nextFloat();
	    }
	    while (segundoValor == 0);
	    
	    double valorDivisao = primeiroValor / segundoValor;
	    
	    System.out.println(primeiroValor + " / " + segundoValor + " = " + valorDivisao);
	}
}