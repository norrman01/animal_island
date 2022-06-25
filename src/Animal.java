import java.awt.*;
import java.util.Random;

public abstract class Animal {
    public Random probability = new Random();
    public Point position = new Point(probability.nextInt(10), probability.nextInt(10));
    public int limitX = 20;
    int speed = 2;
    public int limitY = 20;
    public char[] direction = {'u', 'd', 'l', 'r'};

    public char getDirection() {
        return direction[probability.nextInt(4)];
    }

    int getSpeed(int speed) {

        return probability.nextInt(1, speed+1);
    }

    public void move() {
        int w = getSpeed(speed);
        switch (getDirection()) {
            case 'd': {
                if (position.y - w > 0) position.y -= w;
                else position.y += w;
                break;
            }
            case 'u': {
                if (position.y + w <= limitY) position.y += w;
                else position.y -= w;
                break;
            }
            case 'r': {
                if (position.x + w <= limitX) position.x += w;
                else position.x -= w;
                break;
            }
            case 'l': {
                if (position.x - w > 0) position.x -= w;
                else position.x += w;
            }
        }
    }
}
