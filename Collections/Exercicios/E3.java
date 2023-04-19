package Collections.Exercicios;

import java.util.*;

/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
 O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente
 na Collection Set. Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.
 */

public class E3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Definindo a quantidade de numeros que serao adicionados no set
        final int quantidadeNumeros = 10;

        // Criando um set de valores Integer
        Set<Integer> numeros = new HashSet<>();

        // Inserindo dados ao set criado
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            int addNumero = sc.nextInt();
            numeros.add(addNumero);
        }

        // Listando dados do set
        /*System.out.println("==================");
        System.out.println("Listar dados do Set: ");
        for (Integer setNumeros : numeros) {
            System.out.println(setNumeros);
        }*/

        // Criando iterator do set numeros
        Iterator<Integer> iteratorNumeros = numeros.iterator();

        System.out.println("=========================");
        System.out.println("Listar dados do Set: ");
        while(iteratorNumeros.hasNext()){
            System.out.println(iteratorNumeros.next());
        }

        sc.close();
    }
}
