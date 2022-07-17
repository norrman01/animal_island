package com.company.exemplar;

import com.company.exemplar.enums.ViableType;
import com.company.set.ViableConfig;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class NatureObject {
    public abstract ViableType getViableType();
}
