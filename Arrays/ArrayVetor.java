package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class ArrayVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float[] media = new float[4];
        float numero1, numero2, numero3, somaMedia = 0, mediaGeral = 0, maiorMedia = 0;
        int x;

        for (x = 0; x < media.length; x++) {
            System.out.print("\nEntre com a primeira nota: ");
            numero1 = sc.nextInt();
            System.out.print("\nEntre com a segunda nota: ");
            numero2 = sc.nextInt();
            System.out.print("\nEntre com a terceira nota: ");
            numero3 = sc.nextInt();

            media[x] = (numero1 + numero2 + numero3) / 3;
            somaMedia += media[x];

            if (maiorMedia < media[x]) {
                maiorMedia = media[x];
            }

            System.out.println("\nMedia geral: " + mediaGeral);
            System.out.println("\nMaior media: " + maiorMedia);
        }

        for (x = 0; x<3; x++){
            System.out.println("\nMédia aluneo"+(x+1)+" foi de: "+media[x]);
        }

        sc.close();
    }
}
