package Collections.Exercicios;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/*
Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário,
que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set,
exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja encontrado,
ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */

public class E4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Definindo a quantidade de numeros serao inseridos pelo usuario
        final int quantidadeEntradas = 10;

        // Criando o set do tipo Integer
        Set<Integer> numeros = new HashSet<>();

        //Inserindo dados no set numeros
        for (int i = 0; i < quantidadeEntradas; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            int addNumero = sc.nextInt();
            numeros.add(addNumero);
        }

        // Usuario definindo o numero que deseja buscar
        System.out.println("Digite o numero que voce deseja encontrar: ");
        int buscador = sc.nextInt();

        // Criando a busca definida pelo usuario
        for (Integer buscaSet:numeros) {
            if (buscador == buscaSet){
                System.out.printf("O número %d foi encontrado!", buscaSet);
                return;
            }
        }

        System.out.printf("O número %d não foi encontrado!",buscador);

        sc.close();
    }
}
