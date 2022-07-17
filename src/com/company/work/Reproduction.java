package com.company.work;
import com.company.exemplar.NatureObject;
import com.company.exemplar.enums.ViableType;
import com.company.operation.RandomOperation;
import com.company.operation.SetOperation;
import com.company.set.AnimalsConfig;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Reproduction {
    PlantAndFaunaFactory plantAndFaunaFactory = new PlantAndFaunaFactory();
    AnimalsConfig animalsConfig =  SetOperation.getSetOperation().getAnimalsConfig();
    RandomOperation randomOperation = RandomOperation.getRandomOperation();

    public Optional <NatureObject> reproduce(ViableType viableType){
        ThreadLocalRandom random = randomOperation.getRandom();
        int reproduceChance = random.nextInt(0, 100);
        return Optional.of(reproduceChance).filter(chance -> reproduceChance > 50)
                .map(element -> plantAndFaunaFactory.getInstance(viableType, animalsConfig.getConfig().get(viableType))
                );
    }

}
