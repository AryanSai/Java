import java.util.*;

public class Collectionn {
    public static void main(String[] args) {
        Collection<String> s1= new ArrayList<>();
        s1.add("zai");
        s1.add("sai");
        s1.add("safe");
        System.out.println(s1);

        Collection<String> hs= new HashSet<>();
        hs.add("cat");
        hs.add("arya");
        hs.add("bat");
        System.out.println(hs);

        hs.addAll(s1);
        System.out.println(hs);
    }
}
