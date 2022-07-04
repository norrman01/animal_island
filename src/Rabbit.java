import java.awt.*;
import java.util.Random;

public class Rabbit extends Herbivore {
    @Override
    int getSpeed(int speed) {
        speed =2;
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
        final StringBuffer sb = new StringBuffer("Rabbit{");
        sb.append("position=").append(position);
        sb.append('}');
        return sb.toString();
    }

    public Rabbit() {
        super();
    }
    public static void main(String[] args)  {

        System.out.print(Island.createRabbit(5));


    }
}
