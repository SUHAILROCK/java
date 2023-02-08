interface Al {
    void method1();

    void method2();
}

interface Bo extends Al {
    void method3();
}

class Gfg implements Bo {
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public void method3() {
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        Gfg g = new Gfg();
        g.method1();
        g.method2();
        g.method3();
    }
}
