
abstract class Duck implements Swimmer {
    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming.");
    }
}


class RubberDuck extends Duck implements Squeaker {
    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}

class WoodenDuck extends Duck {
    
}


class RedHeadDuck extends Duck implements Flyer, Quacker {
    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck is quacking!");
    }
}

class LakeDuck extends Duck implements Flyer, Quacker {
    @Override
    public void fly() {
        System.out.println("Lake Duck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck is quacking!");
    }
}


public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        ((Squeaker) rubberDuck).squeak();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.swim();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        ((Flyer) redHeadDuck).fly();
        ((Quacker) redHeadDuck).quack();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        ((Flyer) lakeDuck).fly();
        ((Quacker) lakeDuck).quack();
    }
}
