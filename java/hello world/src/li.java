import java.util.*;

// import java.util.ArrayList;
// import java.util.Collections;
public class li {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("suhail");
        name.add("l");
        name.add("h");
        name.add("u");
        name.add("p");
        // for (int i = 0; i <= 4; i++) {
        // System.out.println(name.get(i));
        // }
        // Collections.sort(name);
        for (String i : name) {
            System.out.println(i);
        }
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(15);
        number.add(14);
        number.add(13);
        number.add(12);
        for (Integer o : number) {
            System.out.println(o);
        }
    }
}