import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.FileWriter; // Import the FileWriter class

public class CreateJava {
    public static void main(String[] args) {
        String filename;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file name");
        filename = scanner.nextLine();
        try {

            File file = new File(filename + ".java");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                FileWriter myWriter = new FileWriter(filename + ".java");
                myWriter.write("public class " + filename
                        + " {\n    public static void main(String[] args) {\n\n}\n}");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
                System.out.println("File path: " + file.getPath());
                System.out.println("isFile : " + file.isFile());
                System.out.println("File name: " + file.getName());
                System.out.println("Absolute path: " + file.getAbsolutePath());
                System.out.println("Writeable: " + file.canWrite());
                System.out.println("Readable " + file.canRead());
                System.out.println("File size in bytes " + file.length());


            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
