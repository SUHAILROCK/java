class Bike1 {
    String name = "test1";

    Bike1() {
        // this.name = "test";
    }

    void Bike12(String name) {
        this.name = name;
        // System.out.println(name);
    }

    void output() {
        System.out.println(name);
    }

    // main method
    public static void main(String args[]) {
        // calling a default construct
        // Bike1 b = new Bike1("suhail");
        Bike1 a = new Bike1();

        System.out.println(a.name);
        a.Bike12("na");
        System.out.println(a.name);
        a.Bike12("test23");
        System.out.println(a.name);
        // System.out.println(b.name);
        // b.output();
    }
}