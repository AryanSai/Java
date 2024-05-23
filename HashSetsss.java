import java.util.HashMap;
import java.util.HashSet;

public class HashSetsss {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
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

        HashSet<String> carss = new HashSet<>();
        carss.add("Volvo");
        carss.add("BMW");
        carss.add("Ford");
        carss.add("BMW");
        carss.add("Mazda");
        System.out.println(carss);

        carss.contains("Mazda");
    }
}
