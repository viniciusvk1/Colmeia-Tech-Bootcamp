package Java.LacosDeDecisao.Exercicios;

import java.util.Locale;
import java.util.Scanner;


/*
Escreva um algoritmo em Java, que leia um número inteiro via teclado
e mostre na tela uma mensagem indicando
se este número é par ou ímpar e se o número é positivo ou negativo.

Na construção do Algoritmo, utilize os seguintes conteúdos:
 -Entrada e Saída de dados
 - Operadores
 - Laço Condicional IF

 */
public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0 && numero > 0) {
            System.out.printf("O numero %d é par e positivo!", numero);
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.printf("O numero %d é par e negativo!", numero);
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.printf("O numero %d é impar e negativo!", numero);
        } else {
            System.out.printf("O Número %d é ímpar e positivo!", numero);
        }

        sc.close();
    }
}
