package exercicios.lacosrepeticao;

import java.util.Scanner;

public class Ex09
{
	public static void main(String[] args) {
	    int valorDelimitador;
	    Scanner input = new Scanner(System.in);
	    
	    do {
	        System.out.print("Insira o valor do delimitador: ");
	        valorDelimitador = input.nextInt();
	        if (valorDelimitador <= 0) {
	            System.out.println("\n-O VALOR INSERIDO DEVE SER MAIOR QUE 0-\n");
	        }
	    } while (valorDelimitador <= 0);
	    
	    
	    for (int i = 1; i <= valorDelimitador; i++) System.out.println(i);
	}
}