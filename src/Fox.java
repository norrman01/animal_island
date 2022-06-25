

public class Fox extends Predator{

    @Override
    int getSpeed(int speed) {
        speed =2;
        return super.getSpeed(speed);
    }


    public Fox() {
        super();
    }

    public static void main(String[] args)  {
        Fox fox = new Fox();
        fox.move();
        System.out.println(fox.position);
        fox.move();
        System.out.println(fox.position);

    }
}

