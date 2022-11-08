// package Animals;

public class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        System.out.println("*this fish is hunting a smaller fish");
    }

    @Override
    public void flee() {
        // TODO Auto-generated method stub
        System.out.println("*this fish is fleeing a larger fish");

    }

}
