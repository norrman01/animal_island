package com.company.work;

import com.company.exemplar.Fauna;
import com.company.exemplar.NatureObject;
import com.company.operation.RandomOperation;
import com.company.operation.SetOperation;
import com.company.set.ChanceToKill;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KillService {

    ChanceToKill killingChanceConfig = SetOperation.getSetOperation().getChanceToKill();

    RandomOperation randomOperation = RandomOperation.getRandomOperation();

    public  Optional<NatureObject> kill (Fauna who, NatureObject whom){
        Integer animalKillingChance = killingChanceConfig.getConfig().get(who.getViableType()).get(whom.getViableType());

        ThreadLocalRandom random = randomOperation.getRandom();
        int generatedChance = random.nextInt(0, 100);
        return Optional.of(who).filter(fauna -> generatedChance > animalKillingChance).map(obj -> whom);
    }
}
