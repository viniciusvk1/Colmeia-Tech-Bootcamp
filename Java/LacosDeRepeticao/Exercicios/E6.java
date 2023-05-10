package Java.LacosDeRepeticao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

// Escreva um algoritmo em Java,
// que leia números inteiros via teclado, até que o número zero seja digitado. Ao final,
// mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.


//Na construção do Algoritmo, utilize os seguintes conteúdos:
//Entrada e Saída de dados
//Operadores
//Laços Condicionais
//Laço de Repetição DO...WHILE

public class E6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, soma = 0, contador = 0;
        double media;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador == 0) {
            System.out.println("Não foram digitados números múltiplos de 3.");
        } else {
            media = (double) soma / contador;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        }


        sc.close();
    }
}
