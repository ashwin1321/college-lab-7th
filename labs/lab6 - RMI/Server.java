import java.rmi.*;

public class Server {

    public static void main(String a[]) throws Exception{
        AddC obj = new AddC();
        Naming.rebind("ADD", obj);
        AddC ob1j = new AddC();
        Naming.rebind("Pi", ob1j);
        AddC obj2 = new AddC();
        Naming.rebind("Factorial", obj2);

        System.out.println("server started....");
    }
    
}
