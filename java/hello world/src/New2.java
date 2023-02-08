abstract class New2 {
    abstract int getRateOfInterest();
}

class SBI extends New2 {
    int getRateOfInterest() {
        return 7;
    }
}

class Borada extends New2 {
    int getRateOfInterest() {
        return 8;
    }
}

class TestBank {
    public static void main(String args[]) {
        New2 b;
        b = new SBI();
        System.out.println("Rate of Interest on SBI: " + b.getRateOfInterest() + " %");
        b = new Borada();
        System.out.println("Rate of Interest on Borada: " + b.getRateOfInterest() + " %");
    }
}