public class BitMask {
    public static void main(String[] args) {
        // String str = "abcdefghijklmnopqrstuvwxyz";
        String str = "xyz";

        int charBitmask = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int charIndex = currentChar - 'a'; // Assuming lowercase English letters

            // Check if the bit is already set
            if ((charBitmask & (1 << charIndex)) != 0) {
                System.out.println("Character " + currentChar + " already appeared.");
            } else {
                // Set the bit to mark the character as appeared
                charBitmask |= (1 << charIndex);
            }
        }

        // Print the bitmask for demonstration
        System.out.println("Bitmask: " + Integer.toBinaryString(charBitmask));
    }
}
