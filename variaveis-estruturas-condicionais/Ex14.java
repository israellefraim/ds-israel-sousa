import java.util.Scanner;

public class Ex14
{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Álcool: R$2.90  |  Gasolina: R$3.30");
        
        float precoAlcool = 2.90f;
        float precoGasolina = 3.30f;

        System.out.print("\nTipo combustível (A/G): ");
        String tipoCombustivel = input.nextLine().toUpperCase();
        
        System.out.print("Quantidade de litros: ");
        int quantLitros = input.nextInt();
            
        float valorTotal;
        
        switch (tipoCombustivel) {
            case "A":
                if (quantLitros <= 20) {
                    valorTotal = (precoAlcool * quantLitros) * 0.97f;
                } 
                else {
                    valorTotal = (precoAlcool * quantLitros) * 0.95f;
                }
                System.out.println("\nO valor final a ser pago é de R$" + valorTotal);
                
                break;
            case "G":
                if (quantLitros <= 20) {
                    valorTotal = (precoGasolina * quantLitros) * 0.96f;
                }
                else {
                    valorTotal = (precoGasolina * quantLitros) * 0.94f;
                }
                System.out.println("\nO valor final a ser pago é de R$" + valorTotal);
                break;
            default:
                System.out.println("Código Inválido. Use apenas 'A' ou 'G'.");
        }
    }
}
