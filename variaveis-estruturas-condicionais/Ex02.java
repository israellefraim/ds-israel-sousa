import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira quantos km o carro rodou: ");
        float km = scan.nextFloat();

        System.out.println("Insira quantos Litros foram gastos: ");
        int l = scan.nextInt();

        float consumo_medio = km / l;

        System.out.println("\nO consumo médio é de " + (consumo_medio)+ "km/L");
    }
}
