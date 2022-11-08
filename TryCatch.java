import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("input a intger ");
            int x = scanner.nextInt();
            System.out.println("input a divide ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("resault = " + z);

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("input a intger please");
        } catch (Exception e) {
            System.out.println("got something wrong");
        } finally {
            scanner.close();
            System.out.println("finish");
        }

    }
}
