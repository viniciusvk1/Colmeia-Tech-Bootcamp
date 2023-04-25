package POO.Exercicios.E1;

import java.util.Locale;

public class TestaCliente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cliente cliente1 = new Cliente("Vinicius",21,"Dev Jr", 3500.00, "brasileiro");
        cliente1.visualizar();

        Cliente cliente2 = new Cliente("Felipe",25,"Dev Sr", 5000.00, "brasileiro");
        cliente2.visualizar();

    }
}
