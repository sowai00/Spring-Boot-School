import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        // String[] animals = {"cat","dog","rat","brid"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("brid");
        for (String i : animals) {
            System.out.println(i);
        }
    }
}
