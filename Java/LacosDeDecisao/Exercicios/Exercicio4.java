package Java.LacosDeDecisao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
Escreva um algoritmo em Java,
que leia 3 palavras (String), que definem as características de um tipo de animal possível segundo o diagrama abaixo,
que deve ser lido da esquerda para a direita.

Na construção do Algoritmo, utilize os seguintes conteúdos:
 - Entrada e Saída de dados
 - Operadores
 - Laço Condicional If
 - Utilize o Método String.equals() ou String.equalsIgnoreCase() para comparar as palavras

 */

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Seu animal e vertebrado ou invertebrado? ");
        String escolhaVertebrado = sc.nextLine();

        System.out.println("\nSeu animal é (digite um entre essas): ");
        System.out.println("Ave");
        System.out.println("Mamífero");
        System.out.println("Inseto");
        System.out.println("Anelideo");
        String escolhaTipo = sc.nextLine();
        System.out.println();

        System.out.println("\n Agora me diga se seu animal é (digite um entre essas): ");
        System.out.println("Carnivoro");
        System.out.println("Onivoro");
        System.out.println("Herbivoro");
        System.out.println("Hematofago");
        String habitoAlimentar = sc.nextLine();
        System.out.println();

        if (escolhaVertebrado.equalsIgnoreCase("vertebrado")) {
            if (escolhaTipo.equalsIgnoreCase("ave")) {
                if (habitoAlimentar.equalsIgnoreCase("carnivoro")) {
                    System.out.println("\nÁguia");
                } else {
                    System.out.println("\nPomba");
                }
            } else {
                if (habitoAlimentar.equalsIgnoreCase("onivoro")) {
                    System.out.println("\nHomem");
                } else {
                    System.out.println("\nVaca");
                }
            }
        } else if ((escolhaVertebrado.equalsIgnoreCase("invertebrado"))) {
            if (escolhaTipo.equalsIgnoreCase("inseto")) {
                if (habitoAlimentar.equalsIgnoreCase("hermatofago")) {
                    System.out.println("\nPulga");
                } else {
                    System.out.println("\nLagarta");
                }
            } else {
                if (habitoAlimentar.equalsIgnoreCase("Hematofago")) {
                    System.out.println("\nSanguessuga");
                } else {
                    System.out.println("\nMinhoca");
                }
            }
        }

        System.out.println();


        sc.close();

    }
}