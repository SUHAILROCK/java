class Addtion {
    public int Su(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b, int c) {
        return a - b - c;
    }
}

class Addt extends Addtion {
    // public int Sub(int a, int b) {
    // return a + b;
    // }

    // public int Ad(int a, int b, int c) {
    // return a + b + c;
    // }

    public static void main(String[] args) {
        // Addtion d = new Addtion();
        // System.out.println(d.Su(20, 30));
        // System.out.println(d.Add(50, 20, 30));
        Addt a = new Addt();
        System.out.println("this is Subraction:" + a.Su(10, 30));
        System.out.println("this is Addtion:" + a.Add(10, 20, 30));
    }
}