package Java.Arrays.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
//Todos os elementos dos índices ímpares do vetor
//Todos os elementos do vetor que são números pares
//A Soma de todos os elementos do vetor
//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

public class E2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando o vetor
        final int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        // Instanciando valores para as posicoes do vetor
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite a %dª posicao do vetor: ", i + 1);
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        int indiceImpar = 0;
        // Todos os elementos dos índices ímpares do vetor
        System.out.println("\nElementos nos índices ímpares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                indiceImpar = vetor[i];
                System.out.print(indiceImpar + " ");
            }
        }

        //Todos os elementos do vetor que são números pares
        System.out.println("\n\nElementos pares: ");
        int contadorPar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPar = vetor[i];
                System.out.print(contadorPar + " ");
            }
        }

        /* A Soma de todos os elementos do vetor
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }*/

        System.out.print("\n\nSoma: " + soma);

        // A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
        double media = (double) soma / vetor.length;
        System.out.printf("\nMédia: %.2f%n", media);

        sc.close();
    }
}
