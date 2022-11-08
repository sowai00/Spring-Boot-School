package Choose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose a animals");
        System.out.println("1=cat 2=dog");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Cat();
            animal.speak();
        } else if (choice == 2) {
            animal = new Dog();
            animal.speak();
        } else {
            animal = new Animal();
            animal.speak();
        }

    }
}
