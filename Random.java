import java.util.Random;

public class Random {
    public static void main(String[] args) {
        Random random = new Random();
        // random 1-7
        int x = random.nextInt(6) + 1;
        // Rendom 0-1
        double y = random.nextDouble();
        // rendom true and false
        boolean z = random.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
