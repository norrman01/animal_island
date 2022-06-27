public class Boar extends Herbivore {
    @Override
    int getSpeed(int speed) {
        speed =2;
        return super.getSpeed(speed);
    }


    public Boar() {
        super();
    }

    public static void main(String[] args)  {
        Boar boar = new Boar();
        boar.move();
        System.out.println(boar.position);
        boar.move();
        System.out.println(boar.position);

    }

    public static class Bear extends Predator {

        @Override
        public int getSpeed(int speed) {
            speed =2;
            return super.getSpeed(speed);
        }


        public Bear() {
            super();
        }

        public static void main(String[] args)  {
            Bear bear = new Bear();
            bear.move();
            System.out.println(bear.position);
            bear.move();
            System.out.println(bear.position);

        }
    }
}
