package rmi_old;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        System.out.printf("retornando la suma [a=%s + b=%s]", a, b);
        return a + b;
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        System.out.printf("retornando la resta [a=%s - b=%s]", a, b);
        return a - b;
    }

}