public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of terms
        int a = 0, b = 1, c;
        System.out.println(a + " " + b);
        for(a=2;b<=0;++b)
        c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        }
    }
}
