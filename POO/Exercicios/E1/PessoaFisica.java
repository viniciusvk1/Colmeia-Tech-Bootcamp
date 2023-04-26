package POO.Exercicios.E1;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nome, int idade, String emprego, Double salario, String nacionalidade, String cpf) {
        super(nome, idade, emprego, salario, nacionalidade);
        this.cpf = cpf;
    }

    public String Cpf() {
        return cpf;
    }

    public void Cpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar() {
        System.out.printf("\nNome do cliente: %s, idade: %d, emprego: %s, salario: %.2f, nacionalidade: %s, CPF: %s", getNome(), getIdade(), getEmprego(), getSalario(), getNacionalidade(), cpf);
    }



}
