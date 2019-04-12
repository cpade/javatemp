package RMI_Main;

import java.rmi.server.UnicastRemoteObject;

public class SignalHeritage extends UnicastRemoteObject implements monSignal{
    private int id = -1;
    private Object message = null;

    public SignalHeritage() throws java.rmi.RemoteException{
        super();
        this.id = 1;
        this.message = "init";
    }
    public SignalHeritage(int a, Object msg) throws java.rmi.RemoteException{
        this.id = a;
        this.message = msg;
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
