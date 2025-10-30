import java.util.Scanner;

public class Ex05 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Salário Mínimo: R$788,00");

        System.out.print("Insira o valor do seu salário: ");
        float salarioUsuario = input.nextFloat();
        if (salarioUsuario < 788) {
            System.out.println("O seu salário é menor que a base salarial.");
        }
        else {
            System.out.println("O seu salário é " + (salarioUsuario/788) + " vezes o salário mínimo.");
        }

    }
}