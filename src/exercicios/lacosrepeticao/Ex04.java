package exercicios.lacosrepeticao;

import java.util.Scanner;

public class Ex04
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    float[] nota = new float[2];
	    String novoCalculo = "S";
	    
        while (novoCalculo.equals("S")) {
            for (int i = 0; i < 2; i++) {
    	        System.out.print("Insira a " + (i+1) +"ª nota (0-10): ");
    	        nota[i] = input.nextFloat();
    	        if (nota[i] < 0 || nota[i] > 10) {
    	            System.out.println("NOTA INVÁLIDA");
    	            i--;
    	        }
	        }
	        System.out.println("\nMédia simples: " + (nota[0] + nota[1]) / 2);
	        
	        input.nextLine();
	    
	        System.out.print("\nNOVO CÁLCULO (S/N)? ");
	        novoCalculo = input.nextLine().toUpperCase();   
        }
	}
}