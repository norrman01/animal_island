
public class Buffalo extends Herbivore{
    @Override
    int getSpeed(int speed) {
        speed =3;
        return super.getSpeed(speed);
    }


    public Buffalo() {
        super();
    }

    public static void main(String[] args)  {
        Buffalo buffalo = new Buffalo();
        buffalo.move();
        System.out.println(buffalo.position);
        buffalo.move();
        System.out.println(buffalo.position);

    }

}
