package Java.Arrays.Exercicios;

//Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
//Todos os elementos da Diagonal Principal
//Todos os elementos da Diagonal Secundária
//A Soma de todos os elementos da Diagonal Principal
//A Soma de todos os elementos da Diagonal Secundária

import java.util.Locale;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando variaveis
        final int tamanhoMatriz = 3;
        int diagonalPrincipal = 0, diagonalSecundaria = 0;

        // Criando matriz 3x3
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        //Inserindo dados nos indices da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Digite os dados do indice [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        //Atribuindo valor a somaDiagonalPrincipal
        int somaDiagonalPrincipal = 0;
        //Atribuindo valor a somaDiagonalSecundaria
        int somaDiagonalSecundaria = 0;

        // Mostrando elementos da diagonal principal
        System.out.println("\nElementos da diagonal principal:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            System.out.print(matriz[i][i] + " ");
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Mostrando elementos da diagonal secundaria
        System.out.println("\n\nElementos da diagonal secundária:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            System.out.print(matriz[i][2 - 1] + " ");
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("\n\nSoma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        sc.close();

    }
}
