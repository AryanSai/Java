import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStream {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        IntStream stream = Arrays.stream(arr);

        stream.forEach(num -> System.out.print(num + " "));

        String[] arr2 = { "Geeks", "for", "Geeks" };

        // Arrays.stream() to convert array into Stream
        Stream<String> streamm = Arrays.stream(arr2);

        streamm.forEach(str -> System.out.print(str + " "));

        boolean result = Arrays.stream(arr).anyMatch(i -> i == 4);

        System.out.println(result);
    }
}