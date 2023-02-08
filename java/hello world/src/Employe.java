public class Employe {
    static String name(String n, String s) {
        return n + s;
    }

    static int name(int a) {
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Employe name:" + Employe.name("Mohammed", "  " + "suhail"));
        System.out.println("Employe age:" + Employe.name(20));
    }

}
