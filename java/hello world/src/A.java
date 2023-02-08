class A {
    public void printA() {
        System.out.println("suhail");
    }
}

class B extends A {
    public void printB() {
        System.out.println("mohammed");
    }
}

class C extends A {
    public void printC() {
        System.out.println("java");
    }
}

class D extends A {
    public void printD() {
        System.out.println("Class java");
    }

    public static void Birth() {
    }
}

class Demo {
    public static void main(String[] args) {
        B objB = new B();
        objB.printA();
        objB.printB();

        C obj_C = new C();
        obj_C.printA();
        obj_C.printC();

        D objD = new D();
        objD.printA();
        objD.printD();
    }
}
