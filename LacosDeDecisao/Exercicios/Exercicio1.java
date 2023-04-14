package LacosDeDecisao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um algoritmo em Java que leia 3 valores inteiros A, B e C
e imprima na tela se a soma de A + B é maior, menor ou igual a C.

Na construção do Algoritmo, utilize os seguintes conteúdos:
 - Entrada e Saída de dados
 - Operadores
 - Laço Condicional IF

 */

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valorA, valorB, valorC, soma;

        System.out.println("\nDigite tres numeros a seguir: ");
        System.out.print("\n Digite o numero A: ");
        valorA = sc.nextInt();

        System.out.print("\n Digite o numero B: ");
        valorB = sc.nextInt();

        System.out.print("\n Digite o numero C: ");
        valorC = sc.nextInt();

        soma = valorA + valorB;

        if (soma > valorC) {
            System.out.printf("\n%d + %d = %d > %d", valorA, valorB, soma, valorC);
            System.out.println("\nA Soma de A + B é Maior do que C");
        } else if (soma < valorC) {
            System.out.printf("\n%d + %d = %d > %d", valorA, valorB, soma, valorC);
            System.out.println("\nA Soma de A + B é Menor do que C");
        } else {
            System.out.printf("\n%d + %d = %d > %d", valorA, valorB, soma, valorC);
            System.out.println("\nA Soma de A + B é igual do que C");
        }

        sc.close();
    }
}
