package com.company.work.coordinator;

import com.company.exemplar.Cell;
import com.company.exemplar.Fauna;
import com.company.exemplar.NatureObject;
import com.company.work.Reproduction;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Optional;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReproduceCoordinator {

    Reproduction reproduction = new Reproduction();

    public void reproduceOnCell(Cell cell, Fauna fauna) {
        Optional<NatureObject> born = reproduction.reproduce(fauna.getViableType());
        born.ifPresent(natureObject -> cell.getObjectList().add(natureObject));
    }
}
