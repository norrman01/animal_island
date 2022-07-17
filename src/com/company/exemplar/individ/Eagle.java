package com.company.exemplar.individ;


import com.company.exemplar.Fauna;
import com.company.exemplar.enums.ViableType;
import com.company.set.ViableConfig;

import static com.company.exemplar.enums.ViableType.EAGLE;
public class Eagle extends Fauna {
    public Eagle(ViableConfig viableConfig){
        super(viableConfig);
    }

    @Override
    public ViableType getViableType() {
        return EAGLE;
    }
}
