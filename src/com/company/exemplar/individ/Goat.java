package com.company.exemplar.individ;


import com.company.exemplar.Fauna;
import com.company.exemplar.enums.ViableType;
import com.company.set.ViableConfig;

import static com.company.exemplar.enums.ViableType.GOAT;

public class Goat extends Fauna {
    public Goat(ViableConfig viableConfig){
        super(viableConfig);
    }
    @Override
    public ViableType getViableType() {
        return GOAT;
    }
}
