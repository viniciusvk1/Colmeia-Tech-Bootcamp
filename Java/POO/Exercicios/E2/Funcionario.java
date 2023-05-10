package Java.POO.Exercicios.E2;

public class Funcionario {

    private String nome;
    private int id;
    private String cargo;
    private double salario;
    private String setor;

    public Funcionario(String nome, int id, String cargo, double salario, String setor) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void visualizar(){
        System.out.printf("Nome: %s, ID: %d, Cargo: %s, Salario: %.2f, Setor: %s \n", nome, id, cargo, salario, setor);
    }

}
