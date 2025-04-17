import java.util.Scanner;
import java.util.ArrayList;

public class Ex04
{
	public static void main(String[] args) {
	    int i = 0, somaNotas = 0;
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Quantidade de alunos na sala: ");
	    int quantAlunos = input.nextInt();
	    
	    if (quantAlunos <= 0) {
	        System.out.println("Quantidade inválida de alunos.");
	        return;
	    }
	    
	    while (i < quantAlunos) {
	        System.out.print("Insira a nota do " + (i+1) + "º aluno (0 a 10): ");
	        float nota = input.nextInt();
	        
	        if (nota < 0 || nota > 10) {
	        System.out.print("Insira uma nota válida (entre 0 e 10).\n");
	        continue;
	        }
	        
	        somaNotas += nota; 
	        i++;
	    }
	    System.out.println("\nMédia das notas: " + (float) somaNotas / quantAlunos);
	}
}