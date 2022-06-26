
public class Mouse extends Herbivore {
    @Override
    int getSpeed(int speed) {
        speed =1;
        return super.getSpeed(speed);
    }


    public Mouse() {
        super();
    }

    public static void main(String[] args)  {
        Mouse mouse = new Mouse();
        mouse.move();
        System.out.println(mouse.position);
        mouse.move();
        System.out.println(mouse.position);

    }
}
