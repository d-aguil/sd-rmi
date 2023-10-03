package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {

    public static void main(String args[]) {

        try {

            //
            CalculadoraImpl obj = new CalculadoraImpl();

            //
            Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(obj, 0);

            //
            Registry registry = LocateRegistry.getRegistry();

            //
            registry.bind("calculadora", stub);

            //
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }
    }
}