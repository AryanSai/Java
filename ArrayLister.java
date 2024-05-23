import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLister {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("volks");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.remove(0);
        cars.set(0, "maruti");
        System.out.println(cars.size());

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());

        // arraynlist of integers
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(5);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        //for multiple datatype objects
        // ArrayList arr = new ArrayList<>();
        // arr.add(Integer.valueOf(1));
        // arr.add("scaler");
        // System.out.println(arr);
        

         
    }
}
