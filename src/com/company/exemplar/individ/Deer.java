package com.company.exemplar.individ;


import com.company.exemplar.Fauna;
import com.company.exemplar.enums.ViableType;
import com.company.set.ViableConfig;
import static com.company.exemplar.enums.ViableType.DEER;
public class Deer extends Fauna {
  public Deer(ViableConfig viableConfig){
      super(viableConfig);
  }

    @Override
    public ViableType getViableType() {
        return DEER;
    }
}
