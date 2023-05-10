package Java.Arrays;

import java.util.Scanner;

public class ArrayMatriz {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        int linha,coluna,somaNumeros=0,linhaUsuario,colunaUsuario;

        for(linha=0;linha<3;linha++) {
            for(coluna=0;coluna<3;coluna++) {
                System.out.println("\nEntre com um número: ");
                numeros[linha][coluna] = leia.nextInt();
                somaNumeros += numeros[linha][coluna];
            }
        }
        System.out.println("\nValor da linha 1 e coluna 2: "+numeros[1][2]);

        System.out.println("\nQual a linha que deseja ver a informação: ");
        linhaUsuario = leia.nextInt();
        System.out.println("\nQual a coluna que deseja ver a informação: ");
        colunaUsuario = leia.nextInt();

        System.out.println("\nInformação na linha "+linhaUsuario+" e na coluna "
                +colunaUsuario+" tem o valor: "+numeros[linhaUsuario][colunaUsuario]);

        System.out.println("\nSomatório dos números da matriz: "+somaNumeros);
    }

}