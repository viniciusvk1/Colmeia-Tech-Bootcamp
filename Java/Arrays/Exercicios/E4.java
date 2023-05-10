package Java.Arrays.Exercicios;

import java.util.Locale;
import java.util.Scanner;

// Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano.
// As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais,
// logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais,
// armazene as médias de cada participante e exiba as médias de cada um na tela.

public class E4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Definindo variaveis
        final int participantes = 10;
        final int notas = 4;

        // Criando a matriz
        double[][] notasTurma = new double[participantes][notas];

        // Criando o Array
        double[] notasMediaTurma = new double[participantes];

        // Adicionando notas ao indice de cada aluno
        // Somando a media de cada aluno
        for (int i = 0; i < 10; i++) {
            double mediaAluno = 0;
            for (int j = 0; j < 4; j++) {
                System.out.printf("\nDigite a %dª nota do aluno %d: ", j+1,i+1);
                notasTurma[i][j] = sc.nextDouble();
                mediaAluno += notasTurma[i][j];
            }
            notasMediaTurma[i] = mediaAluno/notas;
        }

        // Imprimindo as medias dos alunos
        System.out.println("\n======================");
        System.out.println("\nMédias dos alunos:");
        for(int i = 0; i < participantes; i++){
            System.out.printf("Aluno %d: %.1f%n", i+1, notasMediaTurma[i]);
        }

        sc.close();
    }
}
