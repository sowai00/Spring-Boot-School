import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.FileWriter; // Import the FileWriter class

public class CreateJava {
    public static void main(String[] args) {
        String filename;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a file name");
        filename = scanner.nextLine();
        try {

            File myObj = new File(filename + ".java");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter(filename + ".java");
                myWriter.write("public class " + filename
                        + " {\n.    public static void main(String[] args) {\n\n}");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
