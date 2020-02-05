import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
   private Client() {}
   public static void main(String[] args) {
      try {
         // Getting the registry
         Registry registry = LocateRegistry.getRegistry(null);

         // Looking up the registry for the remote object
         GIXInterface stub = (GIXInterface) registry.lookup("GIXInterface");

//         TODO Calling the remote method using the obtained object
//         String graphIdentifier = "test-identifier";
//         int nodes = 23;
//         stub.addGraph(graphIdentifier, nodes);

//          System.out.println("Remote method invoked");
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString());
         e.printStackTrace();
      }
   }
}