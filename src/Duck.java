
public class Duck extends Herbivore {
    @Override
    int getSpeed(int speed) {
        speed =4;
        return super.getSpeed(speed);
    }


    public Duck() {
        super();
    }

    public static void main(String[] args)  {
        Duck duck = new Duck();
        duck.move();
        System.out.println(duck.position);
        duck.move();
        System.out.println(duck.position);

    }
}
