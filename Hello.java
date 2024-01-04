public class Hello {
    static void newMethod() {
        System.out.println("Hello from newMethod");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print(3);

        String name = "sairam";
        System.out.println(name);
        System.out.println(name.length());

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt);

        System.out.println(Math.max(5, 10));
        System.out.println(Math.random() * 10);

        String[] cars = { "maruthi", "suzuki", "bmw" };
        for (String i : cars) {
            System.out.println(i);
        }

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println(myNumbers[1][2]); // Outputs 7

        newMethod();
    }
}