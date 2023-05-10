package Java.EstruturaDados.Exercicios;

/*
Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
para organizar a ordem de chegada dos Clientes de um Banco.
O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:

1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila
0: O programa deve ser finalizado.

Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..

Menu:

1 - Adicionar Cliente na Fila
2 - Listar todos os Clientes
3 - Retirar Cliente da Fila
0 - Sair

 */

import java.util.*;

public class Fila {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Queue<String> clientes = new LinkedList<>();
        int option = -1;
        String nomeCliente, removerCliente;

        do {
            System.out.println("""
                    ========================================
                                      Menu:
                            1 - Adicionar cliente na Fila
                            2 - Listar todos os Clientes
                            3 - Retirar Cliente da Fila
                            0 - Sair
                    ========================================
                    """);
            System.out.println("Escolha uma opção do menu: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Adicionando novo cliente a fila: ");
                    System.out.print("Digite o nome do cliente: ");
                    sc.nextLine();
                    nomeCliente = sc.nextLine();
                    clientes.add(nomeCliente);
                    System.out.println("Cliente adicionado a fila com sucesso!");
                    break;

                case 2:

                    Iterator<String> iterator = clientes.iterator();

                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }


                    /*
                    Sem iterator
                    System.out.println("Listando os clientes na fila: ");
                    System.out.println(clientes);
                    System.out.println("Quantidade de clientes: " + clientes.size());
                     */
                    break;

                case 3:
                    if (clientes.size() == 0) {
                        System.out.println("A fila esta vazia!");
                    } else {
                        System.out.println("Removendo cliente da fila: ");
                        System.out.print("Escolha o cliente para ser retirado: ");
                        sc.nextLine();
                        removerCliente = sc.nextLine();
                        if(clientes.contains(removerCliente)){
                            clientes.remove(removerCliente);
                            System.out.println("Cliente retirado da fila com sucesso!");
                        } else {
                            System.out.println("Cliente nao encontrado! Cancelando operação.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente.");
            }

        } while (option != 0);

        sc.close();
    }
}
