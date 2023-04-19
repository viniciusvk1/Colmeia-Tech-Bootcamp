package Collections.Exercicios;

import java.util.*;

/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
O programa deverá solicitar ao usuário,
que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList.
Em seguida, faça o que se pede:

Mostre na tela todas as cores que foram adicionadas.
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.*/


public class E1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando Lista do tipo string
        ArrayList<String> cores = new ArrayList<>();

        //Definindo a quantidade de cores que o usuario ira digitar
        final int quantidadeCor = 5;

        // Criando um looping de insercao de dados para o usuario adicionar as cores na lista
        for (int i = 0; i < quantidadeCor; i++) {
            System.out.print("Digite uma cor: ");
            String corUsuario = sc.nextLine();
            cores.add(corUsuario);
        }

        // Listando os elementos adicionados anteriormente na lista
        System.out.println("======================");
        System.out.println("Listar todas as cores: ");
        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }

        // Ordenando em ordem crescente usando o metodo .sort
        Collections.sort(cores);

        // Listando os elementos em ordem crescente
        System.out.println("======================");
        System.out.println("Ordenar as cores: ");
        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }

        sc.close();
    }
}
