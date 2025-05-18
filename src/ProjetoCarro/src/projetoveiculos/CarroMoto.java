package projetoveiculos;

public class CarroMoto {
    
    // atributos
    String modelo;
    int ano;
    int topSpeed;
    int potencia;

    //métodos
    public void mostrarInfos() {
        System.out.println("\n" + modelo);
        System.out.println("\033[1mAno:\033[m " + ano);
        System.out.println("\033[1mTop speed:\033[m " + topSpeed + " km/h");
        System.out.println("\033[1mPotência:\033[m " + potencia + " cv");
    }
}
