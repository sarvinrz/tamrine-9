package Client.Remote;

import java.rmi.Remote;

public interface Site extends Remote {
    String save(String user , String password) throws Exception;
    String update(String user , String password) throws Exception;

}
