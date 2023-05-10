package Java.ExerciciosVariaveis;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a nota 4: ");
        double nota4 = sc.nextDouble();

        double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println();
        System.out.printf("Media final: %.1f%n", mediaFinal);

        sc.close();
    }
}
