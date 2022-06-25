

public class Boa extends Predator {

    @Override
    int getSpeed(int speed) {
        speed =1;
        return super.getSpeed(speed);
    }


    public Boa() {
        super();
    }

    public static void main(String[] args)  {
        Boa boa = new Boa();
        boa.move();
        System.out.println(boa.position);
        boa.move();
        System.out.println(boa.position);
        boa.move();
        System.out.println(boa.position);
        boa.move();
        System.out.println(boa.position);
        boa.move();
        System.out.println(boa.position);
    }
}


