package LacosDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class LacoDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tabuada, x = 1, resultado;

        System.out.print("Digite a tabuada que deseja visualizar: ");
        tabuada = sc.nextInt();
        System.out.printf("============Tabuada do %d==============", tabuada);
        System.out.println();
        do {
            resultado = tabuada * x;
            System.out.println(tabuada + " X " + x + " = " + resultado);
            x++;

        } while (x <= 10);
        System.out.println("=====================================");
        sc.close();
    }
}