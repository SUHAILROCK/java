interface Multiple {
    public void Website1();
}

interface Anotherweb {
    public void Website2();
}

interface Third {
    public void Website3();
}

class Connection implements Multiple, Anotherweb, Third {
    public void Website1() {
        System.out.println("java is here");
    }

    public void Website2() {
        System.out.println("i am java");
    }

    public void Website3() {
        System.out.println("learning interface");
    }

    public static void main(String[] args) {
        Connection c = new Connection();
        c.Website1();
        c.Website2();
        c.Website3();
    }
}
