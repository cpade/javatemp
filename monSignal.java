package RMI_Git;

import java.rmi.RemoteException;

public interface monSignal extends java.rmi.Remote{

    int getId() throws RemoteException;
    boolean setId(int a) throws RemoteException;
    Object getMsg() throws RemoteException;
    boolean setMsg(Object a) throws RemoteException;
    public void methode() throws RemoteException, InterruptedException;

}
