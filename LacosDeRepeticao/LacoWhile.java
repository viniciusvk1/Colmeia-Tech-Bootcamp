package LacosDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, contPar = 0, somaImpar = 0;

        System.out.print("Digite um numero inteiro: ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                contPar++;
            } else {
                somaImpar += numero;
            }
            System.out.print("\nDigite um numero inteiro: ");
            numero = sc.nextInt();
        }

        System.out.println("\nQuantidade de numeros pares digitados: " + contPar);
        System.out.println("Somatorio de numeros impares digitados: " + somaImpar);

        sc.close();
    }
}
