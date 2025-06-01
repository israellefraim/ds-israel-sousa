import java.util.InputMismatchException;
import java.util.Scanner;

public class CarroMoto {
    
    // atributos
    String modelo;
    int ano;
    int topSpeed;
    int potencia;
    int velocidade;

    //métodos
    public void mostrarInfos() {
        System.out.println("\n" + modelo);
        System.out.println("\033[1mAno:\033[m " + ano);
        System.out.println("\033[1mTop speed:\033[m " + topSpeed + " km/h");
        System.out.println("\033[1mPotência:\033[m " + potencia + " cv");
    }

    public void interacaoVeiculo(Scanner input) {
        velocidade = 0;
        boolean loop = true;
        while (loop) {
            try {
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
                    System.out.println("Velocidade atual de " + velocidade + " km/h");
                } else if (codigoInteracao == 2) {
                    System.out.print("\nFrear quantos km/h: ");
                    int frear = input.nextInt();
                    input.nextLine();
                    frear(frear);
                    System.out.println("Velocidade atual de " + velocidade + " km/h");
                } else if (codigoInteracao == 3) {
                    buzinar();
                } else {
                    throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! ESCOLHA APENAS 1, 2 OU 3\033[m");
                }
                System.out.println("\nDeseja fazer outra interação com o/a " + modelo + "? (s/n)");
                String resposta = input.nextLine().trim().toLowerCase();

                if (!resposta.equals("s") && !resposta.equals("n"))
                    throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! ESCOLHA APENAS 's' ou 'n'\033[m");

                loop = (resposta.equals("s"));
            } catch (InputMismatchException e) {
                System.out.println("\n\033[1;4;91mVALOR INVÁLIDO! O VALOR DEVE SER UM NÚMERO INTEIRO\033[m");
                input.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean reiniciarPrograma(Scanner input) {
        while (true) {
            try {
                System.out.println("\nDeseja reiniciar o programa? (s/n)");
                String resposta = input.nextLine().trim().toLowerCase();

                if (!resposta.equals("s") && !resposta.equals("n"))
                    throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! ESCOLHA APENAS 's' ou 'n'\033[m");
                else
                    return resposta.equals("s");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    void acelerar(int aceleracao) {
        if (aceleracao < 0) {
            throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! USE VALORES POSITIVOS PARA ACELERAR\033[m");
        }
        if(velocidade + aceleracao > topSpeed) {
            velocidade = topSpeed;
            System.out.println("Velocidade máxima atingida! (" + topSpeed + " km/h)");
        } else {
            velocidade += aceleracao;
        }
    }

    void frear(int reducao){
        if (reducao < 0) {
            throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! USE VALORES POSITIVOS PARA FREAR\033[m");
        }
        if (velocidade - reducao < 0) {
            velocidade = 0;
            System.out.println("Veículo parado!");
        } else {
            velocidade-=reducao;
        }
    }

    void buzinar() {
        System.out.println("BIIIIII!!!");
    }
}

