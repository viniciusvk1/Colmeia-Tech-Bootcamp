package Java.LacosDeRepeticao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Escreva um algoritmo em Java, que leia números inteiros via teclado,
// até que o número zero seja digitado. Ao final,
// mostre na tela a soma de todos os números digitados, que sejam positivos

//Na construção do Algoritmo, utilize os seguintes conteúdos:
//Entrada e Saída de dados
//Operadores
//Laços Condicionais
//Laço de Repetição DO...WHILE

public class E5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            soma = soma + numero;
        }

        do {
            System.out.print("Digite um numero inteiro: ");
            numero = sc.nextInt();
            if (numero > 0) {
                soma = soma + numero;
            }
        } while (numero != 0);

        System.out.println(soma);

        sc.close();
    }
}
