import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements add1 {
    public AddC() throws Exception{
        super();
    }

    public int add(int x,int y){
        return x+y;
        }
        public int product(int x,int y){
        return x*y;
        }
        public int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
        fact=fact*i;
        }
        return fact;
        }
 }