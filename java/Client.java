import java.rmi.*;

public class Client {

    public static void main(String a[]) throws Exception{

        add1 obj = (add1) Naming.lookup("ADD");
        int n = obj.add(5,4);
        System.out.println("Addition is : " + n);
    }
    
}
