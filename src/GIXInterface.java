import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GIXInterface extends Remote {
    void addGraph(String graphIdentifier, int nodes) throws RemoteException;
}
