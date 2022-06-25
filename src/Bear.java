

public class Bear extends Predator {

    @Override
    int getSpeed(int speed) {
        speed =2;
        return super.getSpeed(speed);
    }


    public Bear() {
        super();
    }

    public static void main(String[] args)  {
        Bear bear = new Bear();
        bear.move();
        System.out.println(bear.position);
        bear.move();
        System.out.println(bear.position);

    }
}
