import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Porcentagem do IPI (%): ");
        int IPI = input.nextInt();

        System.out.println("\nCodigo da peça 1: ");
        int codigo1 = input.nextInt();
        System.out.println("Valor da peça 1: ");
        int valor1 = input.nextInt();
        System.out.println("Quantidade da peça 1: ");
        int quantidade1 = input.nextInt();

        System.out.println("\nCodigo da peça 2: ");
        int codigo2 = input.nextInt();
        System.out.println("Valor da peça 2: ");
        int valor2 = input.nextInt();
        System.out.println("Quantidade da peça 2: ");
        int quantidade2 = input.nextInt();

        int total = (valor1 * quantidade1 + valor2 * quantidade2) * (IPI / 100 + 1);
        System.out.println("Valor total a ser pago: " + total);
    }
}