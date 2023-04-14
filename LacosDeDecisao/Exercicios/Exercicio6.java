package LacosDeDecisao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do colaborador: ");
        String nome = sc.nextLine();
        System.out.println("=============================================");
        System.out.println("Lista de cargos por ID:");
        System.out.println("1 - Gerente = 10% de Reajuste");
        System.out.println("2 - Vendedor = 7% de Reajuste");
        System.out.println("3 - Supervisor = 9% de Reajuste");
        System.out.println("4 - Motorista = 6% de Reajuste");
        System.out.println("5 - Estoquista = 5% de Reajuste");
        System.out.println("6 - Técnico de TI = 8% de Reajuste");
        System.out.println("=============================================");
        System.out.print("Agora digite o ID do cargo do funcionario: ");
        int idCargo = sc.nextInt();
        System.out.println("=============================================");
        System.out.print("Salario: ");
        float salario = sc.nextFloat();
        System.out.println("=============================================");

        double reajuste, novoSalario;

        switch (idCargo) {
            case 1:
                System.out.printf("Nome do colaborador: %s", nome);
                System.out.println("\nCargo: Gerente");
                reajuste = 0.10;
                novoSalario = salario + (salario * reajuste);
                System.out.printf("Salario: %.2f%n", novoSalario);
                break;
            case 2:
                System.out.printf("Nome do colaborador: %s", nome);
                System.out.println("\nCargo: Vendedor");
                reajuste = 0.07;
                novoSalario = salario + (salario * reajuste);
                System.out.printf("Salario: %.2f%n", novoSalario);
                break;
            case 3:
                System.out.printf("Nome do colaborador: %s", nome);
                System.out.println("\nCargo: Supervisor");
                reajuste = 0.09;
                novoSalario = salario + (salario * reajuste);
                System.out.printf("Salario: %.2f%n", novoSalario);
                break;
            case 4:
                System.out.printf("Nome do colaborador: %s", nome);
                System.out.println("\nCargo: Motorista");
                reajuste = 0.06;
                novoSalario = salario + (salario * reajuste);
                System.out.printf("Salario: %.2f%n", novoSalario);
                break;
            case 5:
                System.out.printf("Nome do colaborador: %s", nome);
                System.out.println("\nCargo: Estoquista");
                reajuste = 0.05;
                novoSalario = salario + (salario * reajuste);
                System.out.printf("Salario: %.2f%n", novoSalario);
                break;
            case 6:
                System.out.printf("Nome do colaborador: %s", nome);
                System.out.println("\nCargo: Técnico de TI");
                reajuste = 0.08;
                novoSalario = salario + (salario * reajuste);
                System.out.printf("Salario: %.2f%n", novoSalario);
                break;
            default:
                System.out.println("ID sem correspondencia: ");
        }

        sc.close();
    }
}
