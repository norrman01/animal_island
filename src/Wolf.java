import java.awt.*;
import java.util.Random;


public class Wolf extends Animal{
    @Override
    int getSpeed(int speed) {
        speed =7;
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
