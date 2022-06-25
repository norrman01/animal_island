

public class Sheep extends Herbivore{
    @Override
    int getSpeed(int speed) {
        speed =3;
        return super.getSpeed(speed);
    }


    public Sheep() {
        super();
    }

    public static void main(String[] args)  {
        Sheep sheep = new Sheep();
        sheep.move();
        System.out.println(sheep.position);
        sheep.move();
        System.out.println(sheep.position);

    }

}
