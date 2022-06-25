import java.awt.*;
import java.util.Random;

public class Rabbit extends Herbivore {
    @Override
    int getSpeed(int speed) {
        speed =2;
        return super.getSpeed(speed);
    }

    public Rabbit() {
        super();
    }
    public static void main(String[] args)  {
        Rabbit rabbit = new Rabbit();
        rabbit.move();
        System.out.println(rabbit.position);
        rabbit.move();
        System.out.println(rabbit.position);
        rabbit.move();
        System.out.println(rabbit.position);
    }
}
