import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayLister {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("volks");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.remove(0);
        cars.set(0, "maruti");
        System.out.println(cars.size());

        // wrapper classes for the primitive data types
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // arraynlist of integers
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(5);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("sai", "ram");
        System.out.println(hm);
        System.out.println(hm.get("sai"));

        // Print keys
        for (String i : hm.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String i : hm.values()) {
            System.out.println(i);
        }

        HashSet<String> carss = new HashSet<String>();
        carss.add("Volvo");
        carss.add("BMW");
        carss.add("Ford");
        carss.add("BMW");
        carss.add("Mazda");
        System.out.println(carss);

        carss.contains("Mazda");

        // Make a collection
        ArrayList<String> carsitr = new ArrayList<String>();
        carsitr.add("Volvo");
        carsitr.add("BMW");
        carsitr.add("Ford");
        carsitr.add("Mazda");

        // Get the iterator
        Iterator<String> it = carsitr.iterator();

        // Print the first item
        System.out.println(it.next());

        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());
    }
}
