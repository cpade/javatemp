package RMI_Main;

public interface monSignal {
    int id = -1;
    Object message=null;
    int getId();
    boolean setId(int a);
    Object getMsg();
    boolean setMsg(Object a);
}
