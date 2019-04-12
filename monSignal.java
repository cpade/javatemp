package RMI_Git;

public interface monSignal extends java.rmi.Remote{
    int id = -1;
    Object message=null;
    int getId();
    boolean setId(int a);
    Object getMsg();
    boolean setMsg(Object a);
}
