import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        double x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("whats'x value ?");
        x = scanner.nextDouble();
        System.out.println("whats'y value ?");
        y = scanner.nextDouble();
        z = Math.sqrt(x * x + y * y);
        System.out.println("z=" + z);
        scanner.close();
    }
}
