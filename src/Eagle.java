

public class Eagle extends Predator {
    @Override
    int getSpeed(int speed) {
        speed =2;
        return super.getSpeed(speed);
    }


    public Eagle() {
        super();
    }

    public static void main(String[] args)  {
        Eagle eagle = new Eagle();
        eagle.move();
        System.out.println(eagle.position);
        eagle.move();
        System.out.println(eagle.position);

    }
}
