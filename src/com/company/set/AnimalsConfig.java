package com.company.set;

import com.company.exemplar.enums.ViableType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalsConfig {
    Map <ViableType, ViableConfig> config;

}
