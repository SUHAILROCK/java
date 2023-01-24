import java.util.concurrent.ThreadFactory;

public class Jass implements Thread {
    int today;

    public Jass(int today) {
        this.today = today;
    }

    public void run() {
        System.out.println("today is tusday");
    }

    public static void main(String[] args) {
        jass j = new Jass(24);
        new Thread(j).start();
    }

}
