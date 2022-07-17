package com.company.work;


import com.company.exemplar.Cell;
import com.company.exemplar.Land;
import com.company.exemplar.enums.Course;

public class MoveService {

    public Cell calcCellToMove(Land land, Cell cell, int speed, Course course) {

        return switch (course) {
            case UP -> calcCellToMove(land, cell.getX(), cell.getY() - speed - 1);
            case DOWN -> calcCellToMove(land, cell.getX(), cell.getY() - speed + 1);
            case LEFT -> calcCellToMove(land, cell.getX() - speed - 1, cell.getY());
            case RIGHT -> calcCellToMove(land, cell.getX() + speed - 1, cell.getY());
        };
    }

    private Cell calcCellToMove(Land land, Integer x, Integer y) {
        return land.getCells().get(x).get(y);
    }
}
