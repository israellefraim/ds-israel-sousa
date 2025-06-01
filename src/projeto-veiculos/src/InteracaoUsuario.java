import java.util.InputMismatchException;
import java.util.Scanner;

public class InteracaoUsuario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("----------");
                System.out.println("[1] \033[1mCARRO\033[m\n[2] \033[1mMOTO\033[m");
                System.out.println("----------");

                System.out.print("Escolha um automóvel: ");
                int automovel = input.nextInt();

                if (automovel < 1 || automovel > 2)
                    throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! ESCOLHA APENAS 1 OU 2\033[m");

                if (automovel == 2) {
                    CarroMoto moto1 = new CarroMoto();
                    moto1.modelo = "\033[1;7;95mSuzuki Hayabusa\033[m";
                    moto1.ano = 1999;
                    moto1.topSpeed = 312;
                    moto1.potencia = 173;

                    CarroMoto moto2 = new CarroMoto();
                    moto2.modelo = "\033[1;7;92mKawasaki Ninja ZX‑14R\033[m";
                    moto2.ano = 2006;
                    moto2.topSpeed = 299;
                    moto2.potencia = 200;

                    CarroMoto moto3 = new CarroMoto();
                    moto3.modelo = "\033[1;7;34mHonda Super Blackbird\033[m";
                    moto3.ano = 1996;
                    moto3.topSpeed = 287;
                    moto3.potencia = 164;

                    System.out.println("\n-----------------------");
                    System.out.println("[1] \033[1mSuzuki Hayabusa\033[m\n[2] \033[1mKawasaki Ninja ZX‑14R\033[m\n[3] \033[1mHonda Super Blackbird\033[m");
                    System.out.println("-----------------------");

                    System.out.print("Escolha um modelo: ");
                    int modeloMoto = input.nextInt();
                    input.nextLine();

                    if (modeloMoto < 1 || modeloMoto > 3)
                        throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! ESCOLHA APENAS 1, 2 OU 3\033[m");


                    switch (modeloMoto) {
                        case 1:
                            moto1.mostrarInfos();
                            moto1.interacaoVeiculo(input);
                            break;
                        case 2:
                            moto2.mostrarInfos();
                            moto2.interacaoVeiculo(input);
                            break;
                        case 3:
                            moto3.mostrarInfos();
                            moto3.interacaoVeiculo(input);
                            break;
                    }
                    loop = CarroMoto.reiniciarPrograma(input);
                } else {
                    CarroMoto carro1 = new CarroMoto();
                    carro1.modelo = "\033[1;7;31mMcLaren P1\033[m";
                    carro1.ano = 2013;
                    carro1.topSpeed = 350;
                    carro1.potencia = 916;

                    CarroMoto carro2 = new CarroMoto();
                    carro2.modelo = "\033[1;7;91mFerrari LaFerrari\033[m";
                    carro2.ano = 2013;
                    carro2.topSpeed = 360;
                    carro2.potencia = 963;

                    CarroMoto carro3 = new CarroMoto();
                    carro3.modelo = "\033[1;7;94mPorsche 918 Spyder\033[m";
                    carro3.ano = 2016;
                    carro3.topSpeed = 345;
                    carro3.potencia = 887;

                    System.out.println("\n-----------------------");
                    System.out.println("[1] \033[1mMcLaren P1\033[m\n[2] \033[1mFerrari LaFerrari\033[m\n[3] \033[1mPorsche 918 Spyder\033[m");
                    System.out.println("-----------------------");

                    System.out.print("Escolha um modelo: ");
                    int modeloCarro = input.nextInt();
                    input.nextLine();

                    if (modeloCarro < 1 || modeloCarro > 3)
                        throw new IllegalArgumentException("\n\033[1;4;91mVALOR INVÁLIDO! ESCOLHA APENAS 1, 2 OU 3\033[m");

                    switch (modeloCarro) {
                        case 1:
                            carro1.mostrarInfos();
                            carro1.interacaoVeiculo(input);
                            break;
                        case 2:
                            carro2.mostrarInfos();
                            carro2.interacaoVeiculo(input);
                            break;
                        case 3:
                            carro3.mostrarInfos();
                            carro3.interacaoVeiculo(input);
                            break;
                    }
                    loop = CarroMoto.reiniciarPrograma(input);
                }
            } catch (InputMismatchException e) {
                System.out.println("\n\033[1;4;91mVALOR INVÁLIDO! O VALOR DEVE SER UM NÚMERO INTEIRO\033[m");
                input.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                if (loop)
                    System.out.println("-Programa reiniciado-\n");
                else
                    System.out.println("-Programa encerrado-");
            }
        }
        input.close();
    }
}