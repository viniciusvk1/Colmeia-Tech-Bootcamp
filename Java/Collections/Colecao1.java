package Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecao1 {

    public static void main(String[] args) {


        //criando um List do tipo ArrayList com um objeto wrapper do tipo Integer
        List<Integer> minhaLista = new ArrayList<Integer>();

        //adicionando elementos para dentro do meu ArrayList
        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(5);
        minhaLista.add(3);
        minhaLista.add(10);

        for(Integer listaElementos:minhaLista) {
            System.out.println(listaElementos);
        }

        System.out.println("\nRemovendo um elemento da lista");
        System.out.println();
        minhaLista.remove(0);//vai remover um elemento do ArrayList passando o seu indice

        for(Integer listaElementos:minhaLista) {
            System.out.println(listaElementos);
        }

        int primeiroElemento = minhaLista.get(0);//vai pegar um elemento do meu ArrayList por indice
        System.out.println("\nO primeiro elemento é: "+primeiroElemento);
        System.out.println();

        for(int i=0;i<minhaLista.size();i++) {
            System.out.println("\nElemento: "+minhaLista.get(i));
        }

        Java.Collections.sort(minhaLista);//utilizando o método sort da Java.Collections para ordenar os elementos da minha lista
        System.out.println("\nDepois de ordenado...");
        System.out.println(minhaLista);
        System.out.println();

        Set<Integer> meuSet = new HashSet<Integer>();//criação de uma collection do tipo HashSet

        meuSet.add(1);//adicionando elementos no HashSet
        meuSet.add(5);
        meuSet.add(1);
        meuSet.add(9);
        meuSet.add(2);
        meuSet.add(5);

        Iterator<Integer> iMeuSet = meuSet.iterator();//criando um modificador através da API Iterator para poder manipular o HashSet

        while(iMeuSet.hasNext()) {//utilizando o hasNext para percorrer todos os elementos do meu Iterator
            System.out.println(iMeuSet.next());
        }

    }

}