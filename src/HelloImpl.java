import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    protected HelloImpl() throws RemoteException {
    }

    public String hello(String name) throws RemoteException {
        System.out.println("i  " + name);
        return "hello" + name;
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost:5000/hello", new HelloImpl());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println("Server ist ready for running");
    }
}
