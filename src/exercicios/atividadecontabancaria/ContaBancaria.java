package exercicios.atividadecontabancaria;

public class ContaBancaria {
    static String clientes;
    static int numConta = 11523438;
    static float saldo = 1000f;

    public static void main(String[] args) {
        saldo = sacar(saldo,150);
        saldo = depositar(saldo,320);
    }

    public static float sacar(float saldo, float valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valorDeposito > saldo) {
            System.out.println("Saldo insuficiente para tal valor requisitado.");
        } else {
            saldo = saldo - valorDeposito;
            System.out.println("PROCESSANDO OPERAÇÃO NA CONTA Nº " + numConta + "\nApós o saque no valor de R$" + valorDeposito + " seu novo saldo é de R$" + saldo);
        }
        return saldo;
    }

    public static float depositar(float saldo, float valorDeposito) {
        if (valorDeposito <= 0){
            System.out.println("Valor de déposito inválido.");
        } else {
            saldo = saldo + valorDeposito;
            System.out.println("\nPROCESSANDO OPERAÇÃO NA CONTA Nº " + numConta + "\nApós o depósito no valor de R$" + valorDeposito + " seu novo saldo é de R$" + saldo);
        }
        return saldo;
    }
}