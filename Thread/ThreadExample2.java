
package Thread;

public class ThreadExample2 implements Runnable {
    public void run() { // implements Runnable run()
        System.out.println("Here is the starting point of Thread.");
        for (;;) { // infinite loop to print message
            System.out.println("User Created Thread");
        }
    }

    public static void main(String[] argv) {
        Thread t = new Thread(new ThreadExample2()); // 產生Thread物件
        t.start(); // 開始執行Runnable.run();
        for (;;) {
            System.out.println("Main Thread");
        }
    }
}
