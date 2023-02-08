class Ol {
    // defining a final method inside the parent class.
    public void display() {
        System.out.println("This is a final method.");
    }
}

public class FinalClassExample extends Ol {
    // overriding the final method of the parent class.
    public void display() {
        System.out.println("Overriding the final method.");
    }

    public static void main(String[] args) {
        // creating an object of the child class (Test)
        FinalClassExample obj = new FinalClassExample();
        // calling the final method from the child class object.
        obj.display();
    }
}
