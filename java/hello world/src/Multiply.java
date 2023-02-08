// Java program to illustrate
// high cohesive behavior

public class Multiply {

    int a = 5;
    int b = 5;

    public int mul(int a, int b) {
        this.a = a;
        this.b = b;
        return a * b;
    }
}

class Display {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println(m.mul(5, 5));
    }
}
