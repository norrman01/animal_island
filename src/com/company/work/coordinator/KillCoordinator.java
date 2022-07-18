package com.company.work.coordinator;


import com.company.exemplar.Cell;
import com.company.exemplar.Fauna;
import com.company.exemplar.NatureObject;
import com.company.work.KillService;
import com.company.work.randomwork.RandomKill;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KillCoordinator {

    KillService killService = new KillService();
    RandomKill randomKill = new RandomKill();

    public void killOnCell(Cell cell, Fauna who){
        NatureObject natureObject = randomKill.chooseRandomNatureObjectForKill(cell, who);
        killService.kill(who, natureObject).ifPresent(viable -> cell.getObjectList().remove(viable));
    }


}
