package ExerciciosVariaveis;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o adicional noturno: ");
        double adicionalNoturno = sc.nextDouble();

        System.out.print("Digite as horas extras: ");
        double horasExtras = sc.nextDouble();

        System.out.print("Digite os descontos: ");
        double desconto = sc.nextDouble();

        double salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - desconto;

        System.out.printf("Salario Liquido: %.2f%n", salarioLiquido);

        sc.close();
    }
}
