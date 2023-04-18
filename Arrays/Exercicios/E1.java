package Arrays.Exercicios;

//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
// construa um algoritmo que consiga pesquisar dados no vetor,
// onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor.
// Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.

import java.util.Locale;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando o vetor de inteiros com 10 posicoes
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        // Pedindo para o usuario digitar um numero para ser buscado nas posicoes do vetor
        System.out.print("Digite o número que você deseja encontrar: ");
        int buscador = sc.nextInt();

        //  Buscando o numero no vetor e exibindo a posicaoo dele

        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == buscador) {
                posicao = i;
            }
        }

        // Mostrando resultados da pesquisa

        if (posicao == -1){
            System.out.printf("O número %d não foi encontrado!", buscador);
        } else{
            System.out.printf("O número %d está localizado na posição: %d", buscador, posicao);
        }

        sc.close();
    }
}
