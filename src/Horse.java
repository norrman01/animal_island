
public class Horse extends Herbivore{
    @Override
    int getSpeed(int speed) {
        speed =4;
        return super.getSpeed(speed);
    }


    public Horse() {
        super();
    }

    public static void main(String[] args)  {
        Horse horse = new Horse();
        horse.move();
        System.out.println(horse.position);
        horse.move();
        System.out.println(horse.position);


    }
}
