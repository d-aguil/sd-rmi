package rmi_old;

import java.rmi.Naming;

public class Servidor {

    public static void main(String args[]) {
        try {

            Calculadora calculadora = new CalculadoraImpl();

            Naming.rebind("calculadora_remota" , calculadora);

            System.out.println("esperando invocaciones desde los clientes...");
        } catch (Exception e) {
            System.err.println("ha ocurrido una excepción: " + e.toString());
        }
    }
}
