package com.company.work.coordinator;
import com.company.exemplar.Land;
import com.company.operation.RandomOperation;
import com.company.operation.SetOperation;
import com.company.set.AnimalsConfig;
import com.company.work.PlantAndFaunaFactory;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import static com.company.exemplar.enums.ViableType.*;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PlantCoordinator {

    PlantAndFaunaFactory plantAndFaunaFactory = new PlantAndFaunaFactory();
    AnimalsConfig animalsConfig = SetOperation.getSetOperation().getAnimalsConfig();
    RandomOperation randomOperation = RandomOperation.getRandomOperation();

    public void grow (Land land){
        ThreadLocalRandom random = randomOperation.getRandom();

        land.getCells().stream().flatMap(Collection::stream).forEach(cell -> {
            int i = random.nextInt(0, 100);
            IntStream.range(0, i).forEach(j-> cell.getObjectList()
                    .add(plantAndFaunaFactory.getInstance(PLANT, animalsConfig.getConfig().get(PLANT) )));
        });
    }
}
