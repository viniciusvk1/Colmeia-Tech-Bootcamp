package Java.POO.Exercicios.E1;

import java.util.Locale;

public class TestaCliente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cliente cliente1 = new Cliente("Vinicius", 21, "Dev Jr", 3500.00, "brasileiro");
        cliente1.visualizar();

        Cliente cliente2 = new Cliente("Felipe", 25, "Dev Sr", 5000.00, "brasileiro");
        cliente2.visualizar();

        PessoaFisica clienteCPF1 = new PessoaFisica("Fabio", 54, "Gerente", 15000.00, "brasileiro", "123456789-0");
        clienteCPF1.visualizar();

        PessoaFisica clienteCPF2 = new PessoaFisica("Amanda", 27, "Analista", 4500.00, "Chilena", "112233445566-0");
        clienteCPF2.visualizar();

        PessoaJuridica clienteCNPJ1 = new PessoaJuridica("Guilherme", 56, "CEO", 26000.00, "brasileiro", "612846217864");
        clienteCNPJ1.visualizar();
        PessoaJuridica clienteCNPJ2 = new PessoaJuridica("Mariana", 27, "Dev PJ", 9000.00, "brasileiro", "7567127127");
        clienteCNPJ2.visualizar();

    }
}
