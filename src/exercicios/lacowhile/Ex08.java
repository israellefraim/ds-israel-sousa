import java.util.Scanner;

public class Ex08
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		
		System.out.print("Digite o tamanho do lado do quadrado: ");
		int tamanhoLado = input.nextInt();
		
		while (i <= tamanhoLado) {
		    System.out.println("* ".repeat(tamanhoLado));
		    i++;
		}
	}
}