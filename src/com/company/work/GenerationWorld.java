package com.company.work;


import com.company.exemplar.Land;
import com.company.operation.SetOperation;
import com.company.set.MapSet;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GenerationWorld {

    MapSet mapSet = SetOperation.getSetOperation().getMapSet();
    EntityCreator entityCreator = new EntityCreator();

    public void worldGeneration(Land land) {
        for (int i = 0; i < mapSet.getX(); i++) {
            for (int j = 0; j < mapSet.getY(); j++) {
                land.getCells().get(i).get(j).getObjectList().addAll(entityCreator.createEntities());

            }

        }
    }
}
