import java.util.Scanner;

public class Calculadora {
    public static void calcularRaiz(float numero){
        System.out.println(Math.sqrt(numero));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numeroFinal = 0;

        System.out.println("\033[1;91m------🧮 CALCULADORA ALPHA------\033[m");

        while (true) {
            System.out.println("\nInsira o primeiro número: ");
            float primeiroNumero = input.nextFloat();
            System.out.println("Insira o segundo número: ");
            float segundoNumero = input.nextFloat();

            System.out.println("----------------------");
            System.out.println("\n[1] SOMA\n[2] SUBTRAÇÃO\n[3] MULTIPLICAÇÃO\n[4] DIVISÃO\n");
            System.out.println("\n--------------------");

            float soma = primeiroNumero + segundoNumero;
            float subtracao = primeiroNumero - segundoNumero;
            float multiplicacao = primeiroNumero * segundoNumero;
            float divisao = primeiroNumero / segundoNumero;

            System.out.println("Escolha uma operação: ");
            int operacao = input.nextInt();


            switch (operacao) {
                case 1:
                    System.out.println("\nSOMA = " + soma);
                    numeroFinal = soma;
                case 2:
                    System.out.println("\nSUBTRAÇÃO = " + subtracao);
                    numeroFinal = subtracao;
                case 3:
                    System.out.println("\nMULTIPLICAÇÃO = " + multiplicacao);
                    numeroFinal = multiplicacao;
                case 4:
                    System.out.println("\nDIVISÃO = " + divisao);
                    numeroFinal = divisao;
            }

            System.out.println("\nDeseja calcular a raiz do " + numeroFinal + "? (S/N)");
            String resposta = input.nextLine().toUpperCase();
            if (resposta.equals("S")){
                System.out.println("RAIZ = " + Math.sqrt(numeroFinal));
            }

            System.out.println("Deseja reiniciar o programa? (S/N)");
            resposta = input.nextLine().toUpperCase();
            if (resposta.equals("N")) {
                break;
            }



        }


    }


}

