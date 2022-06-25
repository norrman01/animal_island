
public class Goat extends Herbivore{
    @Override
    int getSpeed(int speed) {
        speed =3;
        return super.getSpeed(speed);
    }


    public Goat() {
        super();
    }

    public static void main(String[] args)  {
        Goat goat = new Goat();
        goat.move();
        System.out.println(goat.position);
        goat.move();
        System.out.println(goat.position);

    }
}
