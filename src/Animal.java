import java.awt.*;
import java.util.Random;

public  abstract class Animal implements Reproduction {
    public  Random probability = new Random();
    public Point position = new Point(probability.nextInt(4), probability.nextInt(4));
    int speed;
    public int limitX = 50;
    public int limitY = 50;
    public char[] direction = {'u', 'd', 'l', 'r'};

    public  Point getPosition() {
        return position;
    }

    public char getDirection() {
        return direction[probability.nextInt(4)];
    }

   int getSpeed(int speed) {

        return probability.nextInt(1, speed + 1);
    }

    public void move() {
        int run = getSpeed(speed);
        switch (getDirection()) {
            case 'd': {
                if (position.y - run > 0) position.y -= run;
                else position.y += run;
                break;
            }
            case 'u': {
                if (position.y + run <= limitY) position.y += run;
                else position.y -= run;
                break;
            }
            case 'r': {
                if (position.x + run <= limitX) position.x += run;
                else position.x -= run;
                break;
            }
            case 'l': {
                if (position.x - run > 0) position.x -= run;
                else position.x += run;
            }
        }
    }

}
