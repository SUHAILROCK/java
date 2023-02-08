public interface Code {
    public void java();

    public void method();

    public void time();

    public void place();

}

abstract class Test1 implements Code {
    // public void java() {
    // System.out.print("this is java" + " ");
    // }
    abstract public void java();

    public void method() {
        System.out.println(" and we writing code" + " ");
    }

    abstract void gonr();
}

class Test2 extends Test1 {
    public void java() {
        System.out.print("this is java6555" + " ");
    }

    public void time() {
        System.out.print("using interface concept" + " ");
    }

    public void place() {
        System.out.print("on  vs code editor" + " ");
    }

    public void gonr() {
        System.out.println("s");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.java();
        t.method();
        t.time();
        t.place();
    }

}