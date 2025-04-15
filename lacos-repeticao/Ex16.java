import java.util.Scanner;

public class Ex16
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float menorNum = 0, maiorNum = 0, somaNum = 0;
		
		System.out.print("Quantidade de números a ser inseridos no conjunto: ");
		int quantidade = input.nextInt();
		
		float[] conjuntoNumeros = new float[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
		    System.out.print("Insira o valor da posição " + i + ": ");
		    conjuntoNumeros[i] = input.nextFloat();
		    
		    if (i == 0) {
		        menorNum = conjuntoNumeros[i];
		        maiorNum = conjuntoNumeros[i];
		    }
		    
		    if (conjuntoNumeros[i] < menorNum) {
		        menorNum = conjuntoNumeros[i];
		    }
		    else if (conjuntoNumeros[i] > maiorNum) {
		        maiorNum = conjuntoNumeros[i];
		    }
		    
		    somaNum += conjuntoNumeros[i];
		}
		
		System.out.println("Maior número = " + maiorNum);
		System.out.println("Menor número = " + menorNum);
		System.out.println("Soma dos números = " + somaNum);
	}
}
