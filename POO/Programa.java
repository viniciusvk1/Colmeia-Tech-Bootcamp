package POO;

public class Programa {
    public static void main(String[] args) {

        Automovel auto1 = new Automovel("Charles","Audi Q8","CHA1998",2023);
        auto1.imprimirInfo();

        System.out.println("\nTransferencia de proprietario: ");
        auto1.setNomeProprietario("Cinthia");
        auto1.imprimirInfo();

        System.out.println("\nTrocando a placa do automovel: ");
        auto1.setPlaca("CIN2A00");
        auto1.imprimirInfo();

    }
}
