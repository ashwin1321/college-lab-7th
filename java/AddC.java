import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements add1 {
    public AddC() throws Exception{
        super();
    }

    public int add(int x, int y){
        return x + y;
    }
    
}
