
public class Exception1 {

    public static void main(String[] args) {
        try {
            int result = divideInt(10, 5);
            System.out.println("Result: " + result);
            divideInt(10, 0);
            System.out.println("Result: " + result);
        }

        catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divideInt(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Can't divide by zero");
        }
        return a / b;
    }
}

class DivideByZeroException extends Exception {

    public DivideByZeroException(String message) {
        super(message);
    }
}