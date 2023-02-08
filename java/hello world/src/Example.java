import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of terms for the Fibonacci series: ");
            int n = scan.nextInt();
            int a = 0, b = 1, c;
            System.out.println(a + " " + b);
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.println(" " + c);
                a = b;
                b = c;
            }
        }
    }
}
