import java.rmi.Remote;

import java.rmi.*;

public interface add1 extends Remote {
    public int add(int x, int y) throws Exception;
public int product(int x, int y) throws Exception;
public int factorial(int x) throws Exception;
    
}
