package LacosDeDecisao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoProduto, quantidade;
        double total;

        System.out.println("Lanchonete - Cardapio!");
        System.out.println("=============================================");
        System.out.println("1 - Cachorro Quente - R$ 10.00");
        System.out.println("2 - X-Salada - R$ 15.00");
        System.out.println("3 - X-Bacon - R$ 18.00");
        System.out.println("4 - Bauru - R$ 12.00");
        System.out.println("5 - Refrigerante - R$ 8.00");
        System.out.println("6 - Suco de laranja - R$ 13.00");
        System.out.println("=============================================");

        System.out.println("Por favor, escolha um item por vez: ");
        System.out.print("Digite o codigo do seu pedido: ");
        codigoProduto = sc.nextInt();

        switch (codigoProduto) {
            case 1:
                System.out.print("Digite a quantidade de Cachorro Quente: ");
                quantidade = sc.nextInt();
                total = quantidade * 10.00;
                System.out.println("=============================================");
                System.out.printf("O total a pagar é R$ %.2f\n", total);
                break;
            case 2:
                System.out.print("Digite a quantidade de X-Salada: ");
                quantidade = sc.nextInt();
                total = quantidade * 15.00;
                System.out.println("=============================================");
                System.out.printf("O total a pagar é R$ %.2f\n", total);
                break;
            case 3:
                System.out.print("Digite a quantidade de X-Bacon: ");
                quantidade = sc.nextInt();
                total = quantidade * 18.00;
                System.out.println("=============================================");
                System.out.printf("O total a pagar é R$ %.2f\n", total);
                break;
            case 4:
                System.out.print("Digite a quantidade de Bauru: ");
                quantidade = sc.nextInt();
                total = quantidade * 12.00;
                System.out.println("=============================================");
                System.out.printf("O total a pagar é R$ %.2f\n", total);
                break;
            case 5:
                System.out.print("Digite a quantidade de Refrigerante: ");
                quantidade = sc.nextInt();
                total = quantidade * 8.00;
                System.out.println("=============================================");
                System.out.printf("O total a pagar é R$ %.2f\n", total);
                break;
            case 6:
                System.out.print("Digite a quantidade de Suco de laranja: ");
                quantidade = sc.nextInt();
                total = quantidade * 13.00;
                System.out.println("=============================================");
                System.out.printf("O total a pagar é R$ %.2f\n", total);
                break;
            default:
                System.out.println("=============================================");
                System.out.println("Código inválido!");
                break;
        }

        sc.close();
    }
}

