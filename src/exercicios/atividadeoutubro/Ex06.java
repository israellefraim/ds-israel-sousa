import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int num = input.nextInt();
        
        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));
        
    }
}