package RMI_Git;

import RMI_Sign_TP1.SignalHeritage;
import RMI_Sign_TP1.monSignal;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        Registry registry = null;
        System.out.println(args[0]);
        try {
            if(args[0].equals("client")){
                System.out.println("Client");
                registry = LocateRegistry.getRegistry("192.168.43.249", 2000);
                monSignal mi = (monSignal) registry.lookup("rmi://192.168.43.249:2000/coucou");
                try {
                    mi.methode();
                } catch (InterruptedException e) { e.printStackTrace(); }

            }else if(args[0].equals("serv")) {
                System.out.println("Server1");
                registry = LocateRegistry.createRegistry(2000);
                System.out.println("Server2");
                monSignal mc = new SignalHeritage();
                System.out.println("Server3");
                registry.bind("rmi://localhost:2000/coucou", mc);
                System.out.println("Server4");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
