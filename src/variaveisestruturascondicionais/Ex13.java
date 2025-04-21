package variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex13
{
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.print("Insira seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Insira seu sexo (M/F): ");
		String sexo = input.nextLine();
		
		System.out.print("Insira sua altura (m): ");
		float altura = input.nextFloat();
		
		float pesoIdeal;
		
		if (sexo.equals("M")) {
		    pesoIdeal = (72.7f * altura) - 58;
		} else {
		    pesoIdeal = (62.1f * altura) - 44.7f;
		}
		
        System.out.printf("\nO seu peso ideal é de %.2f kg%n", pesoIdeal);
	
	}
}