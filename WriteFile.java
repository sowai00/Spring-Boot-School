import java.io.IOException;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Rose are red\n2121212212212221\nddw");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
