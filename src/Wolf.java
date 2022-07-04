import java.awt.*;
import java.util.Random;


public class Wolf extends Predator implements Kill{
    @Override
    int getSpeed(int speed) {
        speed =3;
        return super.getSpeed(speed);
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Wolf{");
        sb.append("position=").append(position);
        sb.append('}');
        return sb.toString();
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

    @Override
    public void kill() {

    }
}
