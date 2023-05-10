package Java.LacosDeDecisao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float numero1, numero2, resultado = 0;
        int idOperacao;

        System.out.print("Digite o primeiro numero: ");
        numero1 = sc.nextFloat();

        System.out.print("Digite o segundo numero: ");
        numero2 = sc.nextFloat();

        System.out.print("Operacao: ");
        idOperacao = sc.nextInt();

        switch (idOperacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, resultado);
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Impossivel ocorrer uma divisao por zero!");
                } else {
                    resultado = numero1 / numero2;
                    System.out.printf("%.2f  %.2f = %.2f", numero1, numero2, resultado);
                    break;
                }
            default:
                System.out.println("Operacao invalida!");
        }

        sc.close();
    }

}
