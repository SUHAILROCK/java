import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting point of the Fibonacci series: ");
        int start = scanner.nextInt();
        int num1 = start - 1;
        int num2 = start - 2;
        System.out.println(start + " ");
        for (int i = 1; i <= 10; i++) {
            int current = num1 + num2;
            System.out.println(current + " ");
            num2 = num1;
            num1 = current;
        }
    }
}
