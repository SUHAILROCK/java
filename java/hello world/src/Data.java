import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            // int number;
            // int userName = 5;
            System.out.println("Enter numbers");
            int n = myObj.nextInt();
            try {
                myObj.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter the Integer Vallue");
            }
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
