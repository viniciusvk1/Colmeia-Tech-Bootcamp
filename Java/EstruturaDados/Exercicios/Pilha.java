package Java.EstruturaDados.Exercicios;

/*
Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String,
para organizar a retirada de livros em uma pilha.
O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:

1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha
0: O programa deve ser finalizado.

Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
 */

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Stack<String> livros = new Stack<>();

        int option = -1;
        String nomeLivro;

        do {
            System.out.println("""
                    ========================================
                                      Menu:
                            1 - Adicionar livro na pilha
                            2 - Listar todos os livros
                            3 - Retirar livro da pilha
                            0 - Sair
                    ========================================
                    """);
            System.out.println("Escolha uma opção do menu: ");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Adicionando um novo livro a pilha!");
                    System.out.print("Digite o nome do livro que deseja adicionar: ");
                    sc.nextLine();
                    nomeLivro = sc.nextLine();
                    livros.push(nomeLivro);
                    System.out.printf("Livro %s adicionado com sucesso! \n", nomeLivro);
                    break;

                case 2:
                    if (livros.size() == 0) {
                        System.out.println("Pilha Vazia!");
                    } else {
                        Iterator<String> iterator = livros.iterator();
                        System.out.println("Listando todos os livros na pilha: ");
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }
                    System.out.println("Quantidade de livros: " + livros.size());
                    /*
                    Sem Iterator

                    System.out.println("Listando todos os livros na pilha: ");
                    System.out.println(livros);
                    System.out.println("Quantidade de livros: " + livros.size());
                    */
                    break;

                case 3:
                    if (livros.size() == 0) {
                        System.out.println("Pilha vazia!");
                    } else {
                        System.out.println("Retirando um livro da pilha: ");
                        System.out.print("Digite o nome do livro que deseja retirar: ");
                        nomeLivro = sc.next();
                        boolean encontrou = false;

                        Iterator<String> iterator = livros.iterator();
                        while (iterator.hasNext()) {
                            String livro = iterator.next();
                            if (livro.equals(nomeLivro)) {
                                iterator.remove();
                                System.out.printf("Livro \"%s\" removido com sucesso!\n", nomeLivro);
                                encontrou = true;
                                break;
                            }
                        }

                        if (!encontrou) {
                            System.out.printf("Livro \"%s\" não encontrado!\n", nomeLivro);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Escolha invalida! Tente novamente.");
                    break;

            }
        } while (option != 0);


        sc.close();
    }
}