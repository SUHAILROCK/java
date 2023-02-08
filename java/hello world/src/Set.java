class Set {
    public void line() {
        System.out.println("just a line");
    }
}

class Out extends Set {
    public void line() {
        System.out.println("cross line");
    }
}

class Inter extends Set {
    public void line() {
        System.out.println("double line");
    }

    public static void main(String[] args) {
        // Set s = new Set();
        // Set.Out o = s.new Out();
        // Set.Inter i = s.new Inter();
        Set s = new Set();
        Out o = new Out();
        Inter i = new Inter();
        s.line();
        o.line();
        i.line();
    }
}
