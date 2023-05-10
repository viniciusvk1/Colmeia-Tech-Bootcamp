package Java.LacosDeDecisao;

import java.util.Locale;
import java.util.Scanner;

public class CaseBreak {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        float n1, n2, n3, media;
        int op;

        Scanner ler = new Scanner(System.in);

        System.out.println("\nEntre com a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println("\nEntre com a segunda nota: ");
        n2 = ler.nextFloat();
        System.out.println("\nEntre com a terceira nota: ");
        n3 = ler.nextFloat();

        media = (n1 + n2 + n3) / 3;
        System.out.printf("\nMédia aritmética: %.2f", media);//3.5

        if (media >= 7 && media <= 10) {
            System.out.println("\nAlune Aprovade!!!");
            if (media >= 9) {
                System.out.println("\nNossa, que média maravilhosa!!!");
            }

        } else if (media >= 5 && media < 7) {
            System.out.println("\nAlune de EXAME!!!");
        } else if (media >= 0 && media < 5) {
            System.out.println("\nAlune Reprovade!!!");
        } else {
            System.out.println("\nMédia fora do intervalo!!!");

        }

        System.out.println("\nMenu de elogios!!!");
        System.out.println("\nOpções para elogiar a nossa família COLMÉIA TECH");
        System.out.println("\n1- Todos são muito legais!!! ");
        System.out.println("\n2- Somos muito unidos!!!");
        System.out.println("\n3- Todos são ótimos atores/atrizes!!!");
        System.out.println("\n4- Todos estão se ajudando muito!!!");
        System.out.println("\nEscolha qual elogio quer fazer: ");
        op = ler.nextInt();

        switch (op) {
            case 1:
                System.out.println("\nTodos são muito legais!!! ");
                break;
            case 2:
                System.out.println("\nSomos muito unidos!!!");
                break;
            case 3:
                System.out.println("\nTodos são ótimos atores/atrizes!!!");
                break;
            case 4:
                System.out.println("\nTodos estão se ajudando muito!!!");
                System.out.println("\nBla bla bla");
                if (media > 8) {
                    System.out.println("\nAlém de se ajudar estão tendo bons resultados!!!");
                } else {
                    System.out.println("\nBem, estão se ajudando mas os resultados ainda não estão aparecendo!!!");
                }
                break;
            default:
                System.out.println("\nOpção Inválida!!!");

        }


    }

}
