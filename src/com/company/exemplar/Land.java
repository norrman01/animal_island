package com.company.exemplar;

import lombok.*;
import java.util.ArrayList;
import java.util.List;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Land {
    List<List<Cell>> cells = new ArrayList<>();

}
