package RMI_Git;

import java.rmi.server.UnicastRemoteObject;

public class SignalHéritage extends UnicastRemoteObject implements monSignal {
    private int id = -1;
    private Object message = null;

    public SignalHéritage() throws java.rmi.RemoteException{
        super();
        this.id = 1;
        this.message = "init";
    }
    public SignalHéritage(int a,Object msg) throws java.rmi.RemoteException{
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
