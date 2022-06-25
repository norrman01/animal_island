import java.awt.*;
import java.util.Random;

public class Rabbit extends Animal {
    @Override
    int getSpeed(int speed) {
        speed =3;
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
