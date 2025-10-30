import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o saldo: ");
        float saldo = input.nextFloat();
        
        System.out.println("Reajuste de 1%...");
        
        System.out.println("Novo saldo: " + saldo * 1.01);
    }
}