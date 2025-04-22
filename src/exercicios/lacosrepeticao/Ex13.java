package exercicios.lacosrepeticao;

import java.util.Scanner;

public class Ex13
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite o valor de n: ");
	    int n = input.nextInt();
	    
	    int[] sequencia = new int[n];
	    
	    for (int i = 0; i <= n-1; i++) {
	        if (i <= 1) {
	            sequencia[i] = 1;
	        }
	        else {
	            sequencia[i] = sequencia[i-1] + sequencia[i-2];
	        }
	    }
	    for (int num : sequencia) {
	        System.out.print(num + " ");
	    }
	}
}