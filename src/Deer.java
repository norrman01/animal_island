
public class Deer extends Herbivore {
    @Override
    int getSpeed(int speed) {
        speed =4;
        return super.getSpeed(speed);
    }


    public Deer() {
        super();
    }

    public static void main(String[] args)  {
        Deer deer = new Deer();
        deer.move();
        System.out.println(deer.position);
        deer.move();
        System.out.println(deer.position);

    }
}
