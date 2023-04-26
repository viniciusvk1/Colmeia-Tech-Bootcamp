package POO.Exercicios.E1;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(String nome, int idade, String emprego, Double salario, String nacionalidade, String cnpj) {
        super(nome, idade, emprego, salario, nacionalidade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar() {
        System.out.printf("\nNome do cliente: %s, idade: %d, emprego: %s, salario: %.2f, nacionalidade: %s, CNPJ: %s", getNome(), getIdade(), getEmprego(), getSalario(), getNacionalidade(), cnpj);
    }

}
