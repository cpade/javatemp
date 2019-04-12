package RMI_Git;

import java.rmi.RemoteException;

public interface monSignal extends java.rmi.Remote{
    int id = -1;
    Object message=null;
    int getId();
    boolean setId(int a);
    Object getMsg();
    boolean setMsg(Object a);
    public void methode() throws RemoteException, InterruptedException;
}
