package projetoveiculos;

import java.util.Scanner;

public class CarroMoto {
    
    // atributos
    String modelo;
    int ano;
    int topSpeed;
    int potencia;
    static int velocidade;
    static Scanner input = new Scanner(System.in);

    //métodos
    public void mostrarInfos() {
        System.out.println("\n" + modelo);
        System.out.println("\033[1mAno:\033[m " + ano);
        System.out.println("\033[1mTop speed:\033[m " + topSpeed + " km/h");
        System.out.println("\033[1mPotência:\033[m " + potencia + " cv");
    }

    public void interacaoVeiculo(String modelo) {
        velocidade = 0;
        while (true) {
            System.out.println("\n-----------------------");
            System.out.println("[1] \033[1mACELERAR\033[m\n[2] \033[1mFREAR\033[m\n[3] \033[1mBUZINAR\033[m");
            System.out.println("-----------------------");
            System.out.println("Você está a " + velocidade + " km/h");
            System.out.print("Escolha uma interação com o/a ".concat(modelo).concat(": "));
            int codigoInteracao = input.nextInt();
            input.nextLine();

            if (codigoInteracao == 1) {
                System.out.print("\nAcelerar quantos km/h: ");
                int aceleracao = input.nextInt();
                input.nextLine();
                acelerar(aceleracao);

            } else if (codigoInteracao == 2) {
                System.out.print("\nFrear quantos km/h: ");
                int frear = input.nextInt();
                input.nextLine();
                frear(frear);
            }
            else {
                System.out.println("BIIIIII!!!");
            }

            System.out.println("Deseja fazer outra interação com o/a " + modelo + "? (s/n)");
            String resposta = input.nextLine().trim().toLowerCase();

            if (resposta.equals("n"))
                break;
        }
    }

    static void acelerar(int aceleracao) {
        velocidade+=aceleracao;
    }

    void frear(int reduzir){
        velocidade-=reduzir;
    }

    void buzinar(){
        System.out.println("Carro Buzinando");
    }
}

