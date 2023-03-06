import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements add1 {
    public AddC() throws Exception{
        super();
    }

    public int product(int x, int y){
        return x * y;
    }
    
}
