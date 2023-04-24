package EstruturaDados.Pilha;

import java.util.Iterator;
import java.util.Stack;

public class Pilha1 {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        pilha.push("Livro verde");
        pilha.push("Livro amarelo");
        pilha.push("Livro rosa");
        pilha.push("Livro vermelho");
        pilha.push("Livro preto");

        System.out.println("\nElementos da pilha: " + pilha);
        System.out.println("\nRetirar elemento da pilha: " + pilha.pop());
        System.out.println("\nElemento no topo da pilha: " + pilha.peek());
        System.out.println("\nAdicionando elemento a pilha: " + pilha.push("Livro branco"));
        System.out.println("\nVisualizar a pilha: " + pilha);
        System.out.println("\nTamanho da pilha: " + pilha.size());
        System.out.println("\nO elemento livro cinza esta contido na pilha? " + pilha.contains("Livro cinza"));
        System.out.println("\nExibir elementos da pilha com iterator: ");

        Iterator<String> iterator = pilha.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        pilha.clear();
        System.out.println("\nPilha atualizada: " + pilha);
        System.out.println("\nVerificando se a pilha esta vazia: " + pilha.isEmpty());

    }
}
