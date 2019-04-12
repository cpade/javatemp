package RMI_Git;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        Registry registry = null;
        System.out.println(System.getenv("ServBool"));
        try {
            if(System.getenv("ServBool")=="false"){
                registry = LocateRegistry.getRegistry("127.0.0.1", 2000);
                monSignal mi = (monSignal) registry.lookup("rmi://localhost:1099/coucou");
//                mi.methode();
            }else{
                registry = LocateRegistry.createRegistry(2000);
                monSignal mc = new SignalHéritage();
                registry.bind("rmi://localhost:1099/coucou", mc);
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
