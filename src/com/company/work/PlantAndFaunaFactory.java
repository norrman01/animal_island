package com.company.work;
import com.company.exemplar.NatureObject;
import com.company.exemplar.enums.ViableType;
import com.company.exemplar.individ.*;
import com.company.set.ViableConfig;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import static com.company.exemplar.enums.ViableType.*;
import java.util.Map;
import java.util.function.Function;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PlantAndFaunaFactory {

    Map<ViableType, Function<ViableConfig, NatureObject>> generatedMap=
            Map.ofEntries(
                    Map.entry(PLANT, Plant::new),
                     Map.entry(BEAR, Bear::new),
                     Map.entry(BOA, Boa::new),
                     Map.entry(BOAR, Boar::new),
                     Map.entry(BUFFALO, Buffalo::new),
                     Map.entry(CATERPILLAR, Caterpillar::new),
                     Map.entry(DEER, Deer::new),
                     Map.entry(DUCK, Duck::new),
                     Map.entry(EAGLE, Eagle::new),
                     Map.entry(FOX, Fox::new),
                     Map.entry(GOAT, Goat::new),
                     Map.entry(HORSE, Horse::new),
                     Map.entry(MOUSE, Mouse::new),
                     Map.entry(RABBIT, Rabbit::new),
                     Map.entry(SHEEP, Sheep::new),
                     Map.entry(WOLF, Wolf::new)
            );

    public  NatureObject getInstance(ViableType viableType, ViableConfig viableConfig){
        Function<ViableConfig, NatureObject> function = generatedMap.get(viableType);
        return function.apply(viableConfig);
    }
}
