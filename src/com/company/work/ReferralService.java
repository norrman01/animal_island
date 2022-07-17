package com.company.work;

import com.company.exemplar.Cell;
import com.company.exemplar.enums.Course;
import com.company.operation.SetOperation;
import com.company.set.MapSet;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.company.exemplar.enums.Course.*;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReferralService {
    MapSet mapSet = SetOperation.getSetOperation().getMapSet();

    public List<Course> chooseCorrectCourse(Cell cell, int speed) {
        List<Course> courses = new ArrayList<>(List.of(UP, DOWN, LEFT, RIGHT));

        if (speed > mapSet.getX() - cell.getX()) {
            courses.remove(RIGHT);
        } else if (speed < mapSet.getX() - cell.getX()) {
            courses.remove(LEFT);
        }
        if (speed > mapSet.getY() - cell.getY()) {
            courses.remove(DOWN);
        } else if (speed < mapSet.getY() - cell.getY()) {
            courses.remove(UP);
        }
        return courses;
    }

}
