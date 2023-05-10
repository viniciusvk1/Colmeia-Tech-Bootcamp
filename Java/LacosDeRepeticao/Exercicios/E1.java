package Java.LacosDeRepeticao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
// onde o primeiro número deve ser menor do que o segundo número.
// Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
//Dentro do intervalo informado, mostre na tela todos os números que são múltiplos de 3 e 5

public class E1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int numeroA = sc.nextInt();
        System.out.println("============================");
        System.out.print("Agora o segundo numero inteiro: ");
        int numeroB = sc.nextInt();
        System.out.println("============================");

        if (numeroA < numeroB) {
            for (int i = numeroA; i <= numeroB; i++) {
                if (i % 3 == 0 & i % 5 == 0) {
                    System.out.printf("\n%d é múltiplo de 3 e 5",i);
                }
            }
        } else {
            System.out.println("Intervalo inválido!");
        }


        sc.close();
    }
}
