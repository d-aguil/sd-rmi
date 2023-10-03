package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

    public static void main(String[] args) {

        try {

            //
            Registry registry = LocateRegistry.getRegistry("localhost");

            //
            Calculadora stub = (Calculadora) registry.lookup("calculadora");

            //
            int suma = stub.suma(3, 4);

            //
            System.out.println("suma: " + suma);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
