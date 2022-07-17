package com.company.exemplar.individ;

import com.company.exemplar.NatureObject;
import com.company.exemplar.enums.ViableType;
import com.company.set.ViableConfig;
import static com.company.exemplar.enums.ViableType.PLANT;

public class Plant extends NatureObject {
    public Plant (ViableConfig viableConfig){
        super();
    }

    @Override
    public ViableType getViableType() {
        return PLANT;
    }
}
