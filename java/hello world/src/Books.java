class MyRunnable implements Runnable {
    public void run() {
        System.out.println("good to read books");
    }
}

public class Books {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
