package exercicios.lacosrepeticao;

import java.util.Scanner;

public class Ex11
{
	public static void main(String[] args) {
	    int valorInteiro, i;
	    
	    Scanner input = new Scanner(System.in);
	    
	    do {
	        System.out.print("Insira um valor inteiro: ");
	        valorInteiro = input.nextInt();
	        
	        if (valorInteiro < 1 || valorInteiro > 10) {
	            System.out.println("\n-INSIRA UM VALOR ENTRE 1 E 10-\n");
	        }
	        
	    } while (valorInteiro < 1 || valorInteiro > 10);
	    
	    for (i = 1; i <= 10; i++) {
	        System.out.println(valorInteiro + " * " + i + " = " + valorInteiro * i);
	    }
	}
}