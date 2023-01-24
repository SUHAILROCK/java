public class Phone extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("hello java");
        }
    }

    public static void main(String[] args) {
        Phone run1 = new Phone();
        run1.start();
    }
}
