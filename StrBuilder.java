public class StrBuilder {
    public static void main(String[] args) {
        String s = "sairam";
        s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        sb.append("sa");
        System.out.println(sb);

        // Convert StringBuilder to String
        String resultString = sb.toString();
    
        System.out.println(resultString);

        //reverse
        System.out.println("reverse: " + sb.reverse());
    }
}
