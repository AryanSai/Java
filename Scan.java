import java.util.Scanner;

class Scan {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myScanner.nextLine();  //read entire line
        System.out.println("Username is: " + userName);

        String cls = myScanner.next(); //reads input only till a space
        System.out.println("Class is: " + cls);

        int i = myScanner.nextInt();
        System.out.println(i);



        myScanner.close();
    }
}