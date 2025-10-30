import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        float primeiraMedia = (8 + 9 + 7) / 3;
        System.out.println("A primeira média é: " + primeiraMedia);

        float segundaMedia = (4 + 5 + 6) / 3;
        System.out.println("A segunda média é: " + segundaMedia);

        float somaMedias = primeiraMedia + segundaMedia;
        System.out.println("A soma das médias é: " + somaMedias);

        float mediaDasMedias = somaMedias / 2;
        System.out.println("A média das médias é: " + mediaDasMedias);

    }
}