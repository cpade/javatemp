package RMI_Git;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.TimeUnit;


public class SignalHeritage extends UnicastRemoteObject implements monSignal{
    private int id;
    private Object message;

    public SignalHeritage() throws java.rmi.RemoteException{
        this.id = 1;
        this.message = "init";
    }
    public SignalHeritage(int a, Object msg) throws java.rmi.RemoteException{
        this.id = a;
        this.message = msg;
    }
    public void methode() throws RemoteException, InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        System.out.println("coucou");

    }
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public boolean setId(int a) {
        this.id=a;
        return true;
    }

    @Override
    public Object getMsg() {
        return this.message;
    }

    @Override
    public boolean setMsg(Object a) {
        this.message = a;
        return true;
    }
}
