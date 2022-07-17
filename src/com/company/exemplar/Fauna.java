package com.company.exemplar;


import com.company.set.ViableConfig;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Fauna extends NatureObject{
    Integer speed;

    public Fauna(ViableConfig viableConfig){
        super();
        this.speed = viableConfig.getSpeed();
    }

}
