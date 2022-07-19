package com.company.work.coordinator;


import com.company.exemplar.Cell;
import com.company.exemplar.Fauna;
import com.company.exemplar.Land;
import com.company.exemplar.enums.Course;
import com.company.work.MoveService;
import com.company.work.randomwork.RandomCourse;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MoveCoordinator {

    MoveService moveService = new MoveService();

    RandomCourse randomCourse = new RandomCourse();

    public void move(Land land, Cell cell, Fauna fauna){
        Course course = randomCourse.chooseRandomCourse(cell, fauna.getSpeed());
        Cell purposeCell = moveService.calcCellToMove(land, cell, fauna.getSpeed(), course);

        cell.getObjectList().remove(fauna);
        purposeCell.getObjectList().add(fauna);
    }
}
