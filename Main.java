package RMI_Main;

import rmi_exemple.MaClasse;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        Registry registry = LocateRegistry.createRegistry(1099);
        MaClasse mc = new MaClasse();
        registry.bind("rmi://localhost:1099/coucou", mc);
    }
}
