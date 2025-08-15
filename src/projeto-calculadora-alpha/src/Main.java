import java.util.Scanner;

public class Main {
    static float[] input() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira o 1° número: ");
        float numero1 = myObj.nextFloat();
        System.out.println("Insira o 2° número: ");
        float numero2 = myObj.nextFloat();
        myObj.nextLine();
        return new float[]{numero1, numero2};
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("==== CALCULADORA ALPHA ====");

        while (true) {
            System.out.println("Escolha uma das seguintes operações:");
            System.out.println("[1] Soma\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Raiz Quadrada");

            int opcao = myObj.nextInt();
            myObj.nextLine();

            float[] numeros;

            switch (opcao) {
                case 1:
                    numeros = input();
                    System.out.println("Soma: " + (numeros[0] + numeros[1]));
                    break;
                case 2:
                    numeros = input();
                    System.out.println("Subtração: " + (numeros[0] - numeros[1]));
                    break;
                case 3:
                    numeros = input();
                    System.out.println("Multiplicação: " + (numeros[0] * numeros[1]));
                    break;
                case 4:
                    numeros = input();
                    System.out.println("Divisão: " + (numeros[0] / numeros[1]));
                    break;
                case 5:
                    System.out.println("Insira o número: ");
                    float numero = myObj.nextFloat();
                    System.out.println("Raiz Quadrada: " + Math.sqrt(numero));
                    break;
            }

            System.out.println("Deseja reiniciar a calculadora? (s/n)");
            String resposta = myObj.nextLine();
            if (resposta.equals("n") || resposta.equals("N")) {
                break;
            }
        }
    }
}