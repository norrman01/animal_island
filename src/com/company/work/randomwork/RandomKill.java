package com.company.work.randomwork;
import com.company.exemplar.Cell;
import com.company.exemplar.Fauna;
import com.company.exemplar.NatureObject;
import com.company.operation.RandomOperation;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

import java.util.concurrent.ThreadLocalRandom;


@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RandomKill {

    RandomOperation randomOperation = RandomOperation.getRandomOperation();

    public NatureObject chooseRandomNatureObjectForKill(Cell cell, Fauna fauna){
        List<NatureObject> killing = cell.getObjectList().stream().
                filter(element -> element.getViableType().equals(fauna.getViableType())).toList();
        ThreadLocalRandom random = randomOperation.getRandom();
        int randindex = random.nextInt(0, killing.size());
        return killing.get(randindex);
    }
}
