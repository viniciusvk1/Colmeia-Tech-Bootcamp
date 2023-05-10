package Java.LacosDeRepeticao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento
// e precisam de um sistema para analisar os dados. Escreva um algoritmo em Java,
// que leia via teclado as seguintes informações de cada colaborador:
//Idade (Número inteiro)
//Sexo (Número Inteiro):
//1 – Masculino
//2 – Feminino
//3 – Outros
//Categoria (Número Inteiro):

//1 – Backend
//2 – Frontend
//3 – Mobile
//4 – FullStack

//Após digitar a categoria, o sistema deverá perguntar ao
// usuário se ele deseja continuar a leitura dos dados de um novo colaboradore ou não (S/N).
// Caso seja pressionada a tecla N, mostre na tela:
//

//O número de pessoas desenvolvedoras Backend
//O número de mulheres desenvolvedoras Frontend
//O número de homens desenvolvedores Mobile maiores de 40 anos
//O número de mulheres desenvolvedoras FullStack menores de 30 anos
//

//Na construção do Algoritmo, utilize os seguintes conteúdos:
//Entrada e Saída de dados
//Operadores
//Laços Condicionais
//Laço de Repetição WHILE


public class E4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalBackend = 0, mulheresFrontend = 0, homensMobileMaio40 = 0, mulherFullstackMenor30 = 0;

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.println("======================");
        System.out.println("Digite o sexo: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.println("3 - Outros");
        System.out.print("Escolha: ");
        int escolhaSexo = sc.nextInt();
        System.out.println("======================");
        System.out.println("Categoria: ");
        System.out.println("1 - Backend");
        System.out.println("2 - Frontend");
        System.out.println("3 - Mobile");
        System.out.println("4 - Fullstack");
        System.out.print("Escolha: ");
        int escolhaCategoria = sc.nextInt();

        if (escolhaCategoria == 1) {
            totalBackend++;
        } else if (escolhaSexo == 2 && escolhaCategoria == 2) {
            mulheresFrontend++;
        } else if (escolhaSexo == 1 && escolhaCategoria == 3 && idade < 40) {
            homensMobileMaio40++;
        } else if (escolhaSexo == 2 && escolhaCategoria == 4 && idade < 30) {
            mulherFullstackMenor30++;
        }

        System.out.println("======================");
        System.out.print("Deseja continuar? (S/N) ");
        char continuar = sc.next().charAt(0);

        while (continuar != 'N') {
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.println("======================");
            System.out.println("Digite o sexo: ");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            System.out.println("3 - Outros");
            System.out.print("Escolha: ");
            escolhaSexo = sc.nextInt();
            System.out.println("======================");
            System.out.println("Categoria: ");
            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - Fullstack");
            System.out.print("Escolha: ");
            escolhaCategoria = sc.nextInt();

            if (escolhaCategoria == 1) {
                totalBackend++;
            } else if (escolhaSexo == 2 && escolhaCategoria == 2) {
                mulheresFrontend++;
            } else if (escolhaSexo == 1 && escolhaCategoria == 3 && idade > 40) {
                homensMobileMaio40++;
            } else if (escolhaSexo == 2 && escolhaCategoria == 4 && idade < 30) {
                mulherFullstackMenor30++;
            }

            System.out.println("======================");
            System.out.print("Deseja continuar? (S/N) ");
            continuar = sc.next().charAt(0);

        }

        System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + mulheresFrontend);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + homensMobileMaio40);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulherFullstackMenor30);

        sc.close();
    }
}
