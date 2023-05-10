import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldo = 1000.0f;

        System.out.print("Operação (1 - Saldo, 2 - Saque, 3 - Depósito): ");
        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Operação - Saldo");
                System.out.printf("Saldo: R$ %.2f", saldo);
                break;
            case 2:
                System.out.println("Operação - Saque");
                System.out.print("Valor: R$ ");
                float saque = input.nextFloat();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.printf("Novo Saldo: R$ %.2f", saldo);
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
                break;
            case 3:
                System.out.println("Operação - Depósito");
                System.out.print("Valor: R$ ");
                float deposito = input.nextFloat();
                saldo += deposito;
                System.out.printf("Novo Saldo: R$ %.2f", saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}