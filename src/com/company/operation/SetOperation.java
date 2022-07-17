package com.company.operation;


import com.company.set.AnimalsConfig;
import com.company.set.ChanceToKill;
import com.company.set.MapSet;
import com.company.work.util.ReadConf;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SetOperation {
    public static final String ANIMAL_FEATURE_FILE_PATH = "animal island/src/com/company/characteristic/animalConfig.yml";
    public static final String CHANCE_TO_KILL_FILE_PATH = "animal island/src/com/company/characteristic/chanceToKill.yml";
    public static final String MAP_FEATURE_FILE_PATH = "animal island/src/com/company/characteristic/mapSet.yml";

    static volatile SetOperation setOperation;

    AnimalsConfig animalsConfig;
    ChanceToKill chanceToKill;
    MapSet mapSet;

    public SetOperation(AnimalsConfig animalsConfig, ChanceToKill chanceToKill, MapSet mapSet) {
        this.animalsConfig = animalsConfig;
        this.chanceToKill = chanceToKill;
        this.mapSet = mapSet;
    }

    public static SetOperation getSetOperation() {
        if (setOperation == null) {
            synchronized (SetOperation.class) {
                if (setOperation == null) {
                    setOperation = new SetOperation(
                            ReadConf.readSet(ANIMAL_FEATURE_FILE_PATH, AnimalsConfig.class),
                            ReadConf.readSet(CHANCE_TO_KILL_FILE_PATH, ChanceToKill.class),
                            ReadConf.readSet(MAP_FEATURE_FILE_PATH, MapSet.class)
                    );

                }
            }
        }
        return setOperation;
    }
}
