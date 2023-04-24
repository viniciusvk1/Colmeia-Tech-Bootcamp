package EstruturaDados.Fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {
            fila.add(i);
        }

        System.out.println("Elementos da fila: " + fila);
        System.out.println("\nRemovendo elemento: " + fila.remove());
        System.out.println("\nElementos da fila depois de remover: " + fila);
        System.out.println("\nAdicionando elemento a fila (11): " + fila.add(11));
        System.out.println("\nElementos da fila depois de adicionar novo elemento: " + fila);
        System.out.println("\nPegar um elemento da fila: " + fila.peek());
        System.out.println("\nPegar o tamanho da fila: " + fila.size());
        System.out.println("\nVerificar um elemento da fila: " + fila.contains(10));
        System.out.println("\nExibir e retirar o primeiro elemento da fila: " + fila.poll());
        System.out.println( "\nFila atual: " + fila);

        Iterator<Integer> iterator = fila.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nLimpar a fila: ");
        fila.clear();

        System.out.println("\nFila atualizada: " + fila);
        System.out.println("\nVerificar se a fila esta vazia: " + fila.isEmpty());

    }
}