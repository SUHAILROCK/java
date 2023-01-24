import java.util.InputMismatchException;
import java.util.Scanner;

public class Bio {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci series:");
        try {
            int a = 0, b = 1, c;
            int n = myObj.nextInt();
            if (n == 1) {
                System.out.println(a);
            } else if (n > 0) {
                System.out.println(a + "\n" + b);
                for (int i = 2; i <= n; i++) {
                    c = a + b;
                    System.out.println(c);
                    a = b;
                    b = c;
                }
            }
        } catch (InputMismatchException g) {
            System.out.println("input mismatch");
            g.printStackTrace();
        } catch (ArithmeticException e) {

        }
    }
}
