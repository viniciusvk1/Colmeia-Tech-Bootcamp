package Java.ExerciciosVariaveis;

import java.util.Locale;
import java.util.Scanner;

// Exercicio 1

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o abono: ");
        double abono = sc.nextDouble();

        double novasalario = salario + abono;

        System.out.printf("Novo salario:  %.2f%n");

        sc.close();
    }
}