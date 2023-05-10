package Java.LacosDeRepeticao;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, media, somaMedia = 0, mediaGeral;
        int x;

        for (x = 1; x <= 4; x++) {
            System.out.print("\nEntre com a primeira nota: ");
            nota1 = sc.nextFloat();
            System.out.print("Entre com a segunda nota: ");
            nota2 = sc.nextFloat();
            System.out.print("Entre com a terceira nota: ");
            nota3 = sc.nextFloat();

            media = (nota1 + nota2 + nota3) / 4;
            System.out.printf("\nMedia do aluno %d foi de : %.2f", x, media);

            somaMedia += media;

        }

        mediaGeral = somaMedia / 4;
        System.out.printf("\nMedia geral foi: %.2f", mediaGeral);

        sc.close();
    }
}
