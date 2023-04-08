import java.rmi.*;

public class Client {

    public static void main(String a[]) throws Exception{

        add1 obj=(add1) Naming.lookup("ADD");
        int n=obj.add(5,4);
        System.out.println("Addition is: "+n);
        add1 obj1=(add1) Naming.lookup("Pi");
        int n2=obj1.product(5,4);
        System.out.println("Product is: "+n2);
        add1 obj2=(add1) Naming.lookup("Factorial");
        int n3=obj2.factorial(5);
        System.out.println("Facotrial is: "+n3);
        }
}