package com.company.operation;


import com.company.set.AnimalsConfig;
import com.company.set.ChanceToKill;
import com.company.set.MapSet;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SetOperation {
    public static final String ANIMAL_FEATURE_FILE = "animal island/src/com/company/characteristic/animalConfig.yml"  ;
    public static final String CHANCE_TO_KILL_FILE = "animal island/src/com/company/characteristic/chanceToKill.yml" ;
    public static final String MAP_FEATURE_FILE = "animal island/src/com/company/characteristic/mapSet.yml";

    static volatile SetOperation setOperation;

    AnimalsConfig animalsConfig;
    ChanceToKill chanceToKill;
    MapSet mapSet;

    public SetOperation (AnimalsConfig animalsConfig, ChanceToKill chanceToKill, MapSet mapSet){
        this.animalsConfig = animalsConfig;
        this.chanceToKill = chanceToKill;
        this.mapSet = mapSet;
    }

    public static SetOperation getSetOperation(){
        if (setOperation == null){
            synchronized (SetOperation.class){
                if (setOperation == null) {
                    setOperation = new SetOperation(
                            SetOperation.readSet(ANIMAL_FEATURE_FILE, AnimalsConfig.class),
                            SetOperation.readSet(CHANCE_TO_KILL_FILE, ChanceToKill.class),
                            SetOperation.readSet(MAP_FEATURE_FILE, MapSet.class)
                    );

                }
            }
        }
        return setOperation;
    }
}
