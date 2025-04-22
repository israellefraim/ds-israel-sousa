package exercicios.laco_while;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex03
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    ArrayList<Integer> listaPares = new ArrayList<>();
	    ArrayList<Integer> listaImpares = new ArrayList<>();
	    
	    System.out.print("Digite um número: ");
	    int num = input.nextInt();
	    
	    for (int i = 1; i <= num; i++) {
	        if (i % 2 == 0) {
	            listaPares.add(i);
	        }
	        else {
	            listaImpares.add(i);
	        }
	    }
	    System.out.println(listaImpares + "\n" + listaPares);
	}
}