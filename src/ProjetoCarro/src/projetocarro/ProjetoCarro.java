/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocarro;
import java.util.Scanner;

public class ProjetoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Carro car1 = new Carro();
        car1.modelo = "McLaren P1";
        car1.ano = 2013;
        car1.topSpeed = 350;
        car1.potencia = 916;

        Carro car2 = new Carro();
        car2.modelo = "Ferrari LaFerrari";
        car2.ano = 2013;
        car2.topSpeed = 360;
        car2.potencia = 963;

        Carro car3 = new Carro();
        car3.modelo = "Porsche 918 Spyder";
        car3.ano = 2016;
        car3.topSpeed = 345;
        car3.potencia = 887;

        System.out.println("-----------------------");
        System.out.println("[1] McLaren P1\n[2] Ferrari LaFerrari\n[3] Porsche 918 Spyder");
        System.out.println("-----------------------");

        System.out.print("Escolha um modelo: ");
        int modeloCarro = input.nextInt();

        switch (modeloCarro) {
            case 1:
                System.out.println("\n\033[1;31m" + car1.modelo + "\033[m");
                System.out.println("Ano: " + car1.ano);
                System.out.println("Top speed: " + car1.topSpeed + " km/h");
                System.out.println("Potência: " + car1.potencia + " cv");
                break;
            case 2:
                System.out.println("\n\033[1;91m" + car2.modelo + "\033[m");
                System.out.println("Ano: " + car2.ano);
                System.out.println("Top speed: " + car2.topSpeed + " km/h");
                System.out.println("Potência: " + car2.potencia + " cv");
                break;
            case 3:
                System.out.println("\n\033[1;94m" + car3.modelo + "\033[m");
                System.out.println("Ano: " + car3.ano);
                System.out.println("Top speed: " + car3.topSpeed + " km/h");
                System.out.println("Potência: " + car3.potencia + " cv");
                break;
        }

    }
}
