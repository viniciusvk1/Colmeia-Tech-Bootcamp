package Collections.Exercicios;

/*
Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer,
inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário,
que ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList,
exiba na tela a posição deste número na Collection. Caso o número não seja encontrado,
ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Definindo a quantidade de numeros o usuario ira digitar
        final int quantidadeNumeros = 10;

        // Criando a lista do tipo Integer
        ArrayList<Integer> numeros = new ArrayList<>();

        // Atribuindo valores aos indices da lista numeros
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.printf("Digite um numero para ser adicionado na %dª posicao da lista: ", i + 1);
            int addNumero = sc.nextInt();
            numeros.add(addNumero);
        }

        // Criando metodo para buscar um numero inserido na lista
        System.out.println("====================");
        System.out.print("Digite o número que você deseja encontrar: ");
        int buscador = sc.nextInt();

        // Verificando se o numero existe na lista
        System.out.println("====================");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == buscador) {
                System.out.printf("O número %d está localizado na posição: %d\n", buscador, i);
                System.out.println("====================");
                return;
            }
        }
        System.out.printf("O número %d não foi encontrado!\n", buscador);
        System.out.println("====================");

        sc.close();
    }
}
