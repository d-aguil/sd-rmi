package rmi_old;

import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "client.policy");
        //System.setSecurityManager(new SecurityManager());
        try {
            String url = "//localhost:1099/calculadora_remota";
            System.out.println("obteniendo el objeto calculadora...");
            Calculadora calculadoraStub = (Calculadora)Naming.lookup(url);
            int suma = calculadoraStub.suma(3, 4);
            System.out.println("suma: " + suma);

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
