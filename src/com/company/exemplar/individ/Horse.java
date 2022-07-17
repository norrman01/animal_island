package com.company.exemplar.individ;


import com.company.exemplar.Fauna;
import com.company.exemplar.enums.ViableType;
import com.company.set.ViableConfig;
import static com.company.exemplar.enums.ViableType.HORSE;

public class Horse extends Fauna {
    public Horse (ViableConfig viableConfig){
        super(viableConfig);
    }

    @Override
    public ViableType getViableType() {
        return HORSE;
    }
}
