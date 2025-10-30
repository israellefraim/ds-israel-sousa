import java.util.Scanner;

public class Ex01 
{
    public static int anosParaDias(int anos) {
        return anos * 365; 
    }
    
    public static int mesesParaDias(int meses) {
        return meses * 30;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("-INSIRA SUA IDADE COMPLETA-");

        System.out.print("\nAnos: ");
        int anos = input.nextInt();
        anos = anosParaDias(anos);
        
        System.out.print("Meses: ");
        int meses = input.nextInt();
        meses = mesesParaDias(meses);

        System.out.print("Dias: ");
        int dias = input.nextInt();

        int somaDias = anos + meses + dias;
        
        System.out.println("No total voce viveu por " + somaDias + " dias.");


    }
}