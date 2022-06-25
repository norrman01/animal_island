
public class Caterpillar extends Herbivore {
    @Override
    int getSpeed(int speed) {
        speed =1;
        return super.getSpeed(speed);
    }


    public Caterpillar() {
        super();
    }

    public static void main(String[] args)  {
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.move();
        System.out.println(caterpillar.position);
        caterpillar.move();
        System.out.println(caterpillar.position);

    }
}
