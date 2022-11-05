import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";

        System.out.println("row?");
        rows = scanner.nextInt();
        System.out.println("cols?");
        cols = scanner.nextInt();
        System.out.println("symbol?");
        symbol = scanner.next();

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }

        }
        scanner.close();
    }
}
