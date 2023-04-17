package LacosDeRepeticao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
// via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
// A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

public class E3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int pessoaMenor21 = 0, pessoaMaior50 = 0;
        System.out.print("\nDigite uma idade: ");

        int idade = sc.nextInt();

        while (idade > 0) {
            if (idade < 21) {
                pessoaMenor21++;
            } else if (idade > 50) {
                pessoaMaior50++;
            }
            System.out.print("\nDigite uma idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + pessoaMenor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + pessoaMaior50);


        sc.close();
    }
}
