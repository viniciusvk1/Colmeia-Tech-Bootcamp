package ExerciciosVariaveis;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        float numero1 = sc.nextFloat();

        System.out.println("Digite o numero 2: ");
        float numero2 = sc.nextFloat();

        System.out.println("Digite o numero 3: ");
        float numero3 = sc.nextFloat();

        System.out.println("Digite o numero 4: ");
        float numero4 = sc.nextFloat();

        double calculo = (numero1 * numero2) - (numero3 * numero4);

        System.out.printf("Diferenca: %.1f%n", calculo);

        sc.close();
    }
}