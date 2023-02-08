public class Phone extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // try {
            // sleep(0);
            // } catch (InterruptedException e) {
            // System.out.println(e);
            // }
            System.out.println("hello java1");
        }
    }

    public void timer() {
        for (int i = 1; i <= 5; i++) {
            // try {
            // sleep(0);
            // } catch (InterruptedException e) {
            // System.out.println(e);
            // }
            System.out.println("hello java2");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Phone run1 = new Phone();
        run1.start();

        run1.timer();

        if (run1.isAlive()) {
            System.out.println("I am still alive");
        }
        run1.join();
        if (run1.isAlive()) {
            System.out.println("I am not alive");
        }

        System.out.println("good bye..");
        System.out.println(Thread.interrupted());
    }
}
