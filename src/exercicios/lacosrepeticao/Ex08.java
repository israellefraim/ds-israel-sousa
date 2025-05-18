package exercicios.lacosrepeticao;

import java.util.Scanner;

public class Ex08
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Insira o valor do delimitador: ");
	    int valorDelimitador = input.nextInt();
	    
	    for (int i = 1; i <= valorDelimitador; i++) System.out.println(i);
	}
}