import java.awt.*;
import java.util.*;
import java.util.List;

public  class Island {
   static Map<Point, ArrayList<Animal>> mapIsland = new HashMap<>();
    public static Map<Point, ArrayList<Animal>> createRabbit(int population) {
        Map<Point, ArrayList<Animal>> map = new HashMap<>();
        for (int i = 0; i < population; i++) {
            Rabbit rabbit = new Rabbit();
            Point position = rabbit.getPosition();
            if (!map.containsKey(position)) {
                ArrayList<Animal> rabbitList = new ArrayList<>();
                rabbitList.add(rabbit);
                map.put(position, rabbitList);
                System.out.println(rabbit);
            } else {
                map.get(position).add(rabbit);
                System.out.println(rabbit);
            }
        } return map;
    }
    public static Map<Point, ArrayList<Animal>> createWolf(int population) {
        Map<Point, ArrayList<Animal>> map = new HashMap<>();
        for (int i = 0; i < population; i++) {
            Wolf wolf = new Wolf();
            Point position = wolf.getPosition();
            if (!map.containsKey(position)) {
                ArrayList<Animal> wolfList = new ArrayList<>();
                wolfList.add(wolf);
                map.put(position, wolfList);
                System.out.println(wolf);
            } else {
                map.get(position).add(wolf);
                System.out.println(wolf);
            }
        }return map;
    }

    public static void main(String[] args) {
        mapIsland.putAll(createWolf(6));
       mapIsland.putAll(createRabbit(6));


        for(Map.Entry<Point, ArrayList<Animal>> pair: mapIsland.entrySet())
        {
            Point key = pair.getKey();
            ArrayList<Animal> value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }
}
