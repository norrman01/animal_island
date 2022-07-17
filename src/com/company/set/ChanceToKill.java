package com.company.set;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ChanceToKill {
    Map <ViableConfig, Map<ViableConfig, Integer>> config;

}
