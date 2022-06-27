import java.awt.*;
import java.util.*;
import java.util.List;

public  class Island {
   static Map<Point, ArrayList<Animal>> mapIsland = new HashMap<>();
    public static Map<Point, ArrayList<Animal>> createRabbit(int population){
        Map<Point,ArrayList<Animal>> map = new HashMap<>();
        ArrayList<Animal> rabbitList=new ArrayList<>();
        for (int i = 0; i < population; i++) {
            Rabbit rabbit = new Rabbit();
            Point position = rabbit.getPosition();
            if (!map.containsKey(position)){
                rabbitList = new ArrayList<>();
                rabbitList.add(rabbit);
            } else map.get(position).add(rabbit);
            map.put(position,rabbitList);
        } return map;
    }

    public static void main(String[] args) {

        mapIsland.putAll(createRabbit(10));

        for(Map.Entry<Point, ArrayList<Animal>> pair: mapIsland.entrySet())
        {
            Point key = pair.getKey();
            ArrayList<Animal> value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }
}
