package POO.Exercicios.E2;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Vinicius", 1, "Dev Jr", 3500.00, "Backend");
        funcionario1.visualizar();

        Funcionario funcionario2 = new Funcionario("Felipe", 2, "Dev Jr", 3200.00, "Frontend");
        funcionario2.visualizar();

    }
}
