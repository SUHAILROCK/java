interface Static {
    public void print1();

    static int plus(int x) {
        return x + x;
    }

    class Normal implements Static {
        public void print1() {
            System.out.println("this is static method in interface");
        }
    }

    public static void main(String[] args) {
        Static n = new Normal();
        // Normal n = new Normal();
        n.print1();
        System.out.println(Static.plus(10));
        System.out.println("adding the numbers");
    }
}