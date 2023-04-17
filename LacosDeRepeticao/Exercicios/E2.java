package LacosDeRepeticao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Escreva um algoritmo em Java,
// que leia 10 números inteiros via teclado
// e mostre na tela quantos números são pares e quantos número são ímpares.

public class E2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalPar = 0, totalImpar = 0;

        for (int contadorNumeros = 1; contadorNumeros <= 10; contadorNumeros++) {
            System.out.printf("\nDigite o %dº número: ", contadorNumeros);
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                totalPar++;
            } else {
                totalImpar++;
            }
        }
        System.out.println("==================");
        System.out.println("Total de números pares: " + totalPar);
        System.out.println("Total de números ímpares: " + totalImpar);
        System.out.println("==================");

        sc.close();
    }
}
