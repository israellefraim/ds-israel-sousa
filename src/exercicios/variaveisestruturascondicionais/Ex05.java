package exercicios.variaveisestruturascondicionais;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();

        System.out.print("y = ");
        int y = input.nextInt();

        var temp = x;
        x = y;
        y = temp;

        System.out.println("\nx = " + x);
        System.out.println("y = " + y);
    }
}
