abstract class About {
    protected abstract String Birth();
}

class Name extends About {
    public String Birth() {
        return "march";
    }

    static void hike() {
        System.out.println("io");
    }
}

class Date3 extends About {
    public String Birth() {
        return "28";
    }
}

class runJava {
    public static void main(String[] args) {
        Name n = new Name();
        System.out.println("Birth month: " + n.Birth());
        Date3 de = new Date3();
        System.out.println("Birth date: " + de.Birth());
        Name.hike();
    }
}