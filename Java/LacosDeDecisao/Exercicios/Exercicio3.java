package Java.LacosDeDecisao.Exercicios;

import java.util.Locale;
import java.util.Scanner;


/*
Para doar sangue é necessário ter entre 18 e 69 anos de idade.
Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String),
 a idade (inteiro) do doador e se é a primeira doação (boolean).
 De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.

Na construção do Algoritmo, utilize os seguintes conteúdos:
  - Entrada e Saída de dados
  - Operadores
  - Laço Condicional IF

 */

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do doador: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do doador: ");
        int idade = sc.nextInt();

        System.out.print("Primeira doação de sangue? ");
        boolean escolha = sc.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && escolha) {
                System.out.printf("%s não está apto(a) para doar sangue!\n", nome);
            } else {
                System.out.printf("%s está apto(a) para doar sangue!\n", nome);
            }
        } else {
            System.out.printf("%s não está apto(a) para doar sangue!\n", nome);
        }


        sc.close();
    }
}
