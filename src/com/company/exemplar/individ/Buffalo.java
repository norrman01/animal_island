package com.company.exemplar.individ;


import com.company.exemplar.Fauna;
import com.company.exemplar.enums.ViableType;
import com.company.set.ViableConfig;

import static com.company.exemplar.enums.ViableType.BUFFALO;

public class Buffalo extends Fauna {
    public Buffalo(ViableConfig viableConfig){
        super(viableConfig);
    }

    @Override
    public ViableType getViableType() {
        return BUFFALO;
    }
}
