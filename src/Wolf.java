import java.awt.*;
import java.util.Random;


public class Wolf extends Predator{
    @Override
    int getSpeed(int speed) {
        speed =3;
        return super.getSpeed(speed);
    }


    public Wolf() {
        super();
    }

    public static void main(String[] args)  {
        Wolf wolf = new Wolf();
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
        wolf.move();
        System.out.println(wolf.position);
    }
}
