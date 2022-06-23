import java.awt.*;
import java.util.Random;

public class Animal {
    private Point position=new Point(5,5);
    private int speed=5;
    private Random probability = new Random();
    private int limitX = 20;
    private int limitY = 20;
    private char[] direction = {'u', 'd', 'l', 'r'};

    char getDirection() {
        return direction[probability.nextInt(4)];
    }
    int getSpeed(){
        return probability.nextInt(speed);
    }


    void move() {
        switch (getDirection()) {
            case 'd': {
                if (position.y + getSpeed() < limitY) position.y++;
                else position.y = 0;
                break;
            }
            case 'u': {
                if (position.y - getSpeed() > 0) position.y--;
                else position.y = limitY - 1;
                break;
            }
            case 'r': {
                if (position.x + getSpeed() < limitX) position.x++;
                else position.x = 0;
                break;
            }
            case 'l': {
                if (position.x - getSpeed() > 0) position.x--;
                else position.x = limitX - 1;
            }
        }
    }
    public static void main(String[] args)  {
        Animal rabbit = new Animal();
        rabbit.move();
        System.out.println(rabbit.position);
        rabbit.move();
        System.out.println(rabbit.position);
        rabbit.move();
        System.out.println(rabbit.position);
    }
}
