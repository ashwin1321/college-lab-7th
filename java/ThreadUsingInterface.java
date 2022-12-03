
public class ThreadUsingInterface {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultithreadDemo());
            object.start();
        }
    }

}

class MultithreadDemo implements Runnable {

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }

        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
