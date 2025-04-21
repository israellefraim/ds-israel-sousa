package variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("A = (b.h)/2\n");
        
        System.out.print("Base do triângulo (b) em cm: ");
        int b = input.nextInt();
        
        System.out.print("Altura do triângulo (h) em cm: ");
        int h = input.nextInt();
        
        int area = (b*h)/2;
        
        System.out.println("\nA = ("+ b +"."+ h +")/2");
        System.out.print("A = "+ area);
    }
}