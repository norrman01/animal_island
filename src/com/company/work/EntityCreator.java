package com.company.work;
import com.company.exemplar.NatureObject;
import com.company.exemplar.enums.ViableType;
import com.company.operation.RandomOperation;
import com.company.operation.SetOperation;
import com.company.set.AnimalsConfig;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EntityCreator {

    AnimalsConfig animalsConfig = SetOperation.getSetOperation().getAnimalsConfig();

    PlantAndFaunaFactory factory = new PlantAndFaunaFactory();
    RandomOperation randomOperation = RandomOperation.getRandomOperation();

    public List <NatureObject> createEntities(){
        List<NatureObject> list = new ArrayList<>();
        ViableType[] values = ViableType.values();
        for( ViableType value : values){
            ThreadLocalRandom random = randomOperation.getRandom();
            int randomAmount = random.nextInt(0, animalsConfig.getConfig().get(value).getAmount());
            for (int j = 0; j< randomAmount; j++){
                list.add(factory.getInstance(value, animalsConfig.getConfig().get(value)));
            }
        }
        Collections.shuffle(list);
        return list;
    }
}
