package exercicios.lacowhile;

import java.util.Scanner;

public class Ex06 
{
    public static void main(String [] args) 
    {
        Scanner input = new Scanner(System.in);
        int i = 0;
        float maiorNum = 0; 
        float segundoMaior = 0;
        float[] lista = new float[10];
       
        while (i <= 9) {
            System.out.print("Insira o " + (i+1) + "º número: ");
            lista[i] = input.nextFloat();
            if (i == 0){
                maiorNum = lista[0];
            } else if (i == 1) {
                segundoMaior = lista[1];
            }
            
            if (lista[i] > maiorNum) {
                segundoMaior = maiorNum;
                maiorNum = lista[i];
            } else if (lista[i] > segundoMaior) {
                segundoMaior = lista[i];
            }
            
            i++;
        }
        
        System.out.println("\nO maior número digitado é " + maiorNum);
        System.out.println("O segundo maior número digitado é " + segundoMaior);
    }
}
