package exercicios.agosto;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira uma temperatura em ºC: ");
        int temperaturaCelsius = input.nextInt();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8 + 32);

        System.out.println(temperaturaCelsius + "ºC = " + temperaturaFahrenheit + "ºF");
    }
}
