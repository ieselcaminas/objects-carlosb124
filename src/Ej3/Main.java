package Ej3;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Dani");
        Cuenta c2 = new Cuenta("Dani", 1300);
        c2.retirar(1000);
        System.out.println(c2.getCantidad());

    }
}