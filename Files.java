import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename2.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter("filename2.txt");
            fw.write("Sairam");
            fw.close();
            System.out.println("Success!!");
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            File myObj = new File("filename2.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            System.out.println("Success Read!!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}