import java.util.Scanner;

public class Ex05 
{
    public static void main(String [] args) 
    {
        Scanner input = new Scanner(System.in);
        int i = 0;
        float maiorNum = 0;
        float[] lista = new float[10];
       
        while (i <= 9) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            lista[i] = input.nextFloat();
            if (i == 0){
                maiorNum = lista[0];
            }
            if (lista[i] > maiorNum) {
                maiorNum = lista[i];
            }
            i++;
        }
        
        System.out.println("O maior número digitado é " + maiorNum);
    }
}