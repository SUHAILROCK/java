import java.util.LinkedList;

public class Newl {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // System.out.print(cars.getFirst());
        // cars.addFirst("lambo");
        // cars.addLast("Gt");
        cars.removeFirst();

        System.out.println(cars);
    }
}
