import java.util.Scanner;

class Scan {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myScanner.nextLine();
        System.out.println("Username is: " + userName);
        myScanner.close();
    }
}