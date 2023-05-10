package Java.LacosDeDecisao;

import java.util.Locale;
import java.util.Scanner;

public class LacosDecisao {
    public static void main(String[] args) {

        /*
        Operador Logico E (&&)

        Entrada1    Entrada2    Saida
        V           V           V
        V           F           F
        F           V           F
        F           F           F
         */

        /*
        Operador Logico OU (||)

        Entrada1    Entrada2    Saida
        V           V           V
        V           F           V
        F           V           V
        F           F           F
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, media;

        System.out.print("Entre com a primeira nota: ");
        n1 = sc.nextFloat();

        System.out.print("Entre com a segunda nota: ");
        n2 = sc.nextFloat();

        System.out.print("Entre com a terceira nota: ");
        n3 = sc.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("A media final foi: %.2f . ", media);

        if (media >= 7 && media <= 10) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em exame!");
        } else if (media >= 0 && media < 5) {
            System.out.println("Aluno reprovado!");
        } else {
            System.out.println("Media fora do intervalo!");
        }

        sc.close();
    }
}
