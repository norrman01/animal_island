package com.company;
import com.company.exemplar.Cell;
import com.company.exemplar.Fauna;
import com.company.exemplar.Land;
import com.company.exemplar.NatureObject;
import com.company.exemplar.enums.ViableType;
import com.company.operation.SetOperation;
import com.company.set.MapSet;
import com.company.work.GenerationWorld;
import com.company.work.coordinator.KillCoordinator;
import com.company.work.coordinator.MoveCoordinator;
import com.company.work.coordinator.PlantCoordinator;
import com.company.work.coordinator.ReproduceCoordinator;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;


import java.util.concurrent.*;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;



@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AnimalIsland {
    MapSet mapSet = SetOperation.getSetOperation().getMapSet();
    GenerationWorld generationWorld = new GenerationWorld();
    KillCoordinator killCoordinator = new KillCoordinator();
    ReproduceCoordinator reproduceCoordinator = new ReproduceCoordinator();
    MoveCoordinator moveCoordinator = new MoveCoordinator();
    PlantCoordinator plantCoordinator = new PlantCoordinator();

    public void go(){
        Land land = initLand(mapSet);
        generationWorld.worldGeneration(land);
        Runnable scheduleTask = () -> {
            plantCoordinator.grow(land);
            Map<ViableType, Long> collect = land.getCells().stream()
                    .flatMap(Collection::stream)
                    .flatMap(cell -> cell.getObjectList()
                            .stream()).collect(Collectors.groupingBy(NatureObject::getViableType,Collectors.counting()));
            for(Map.Entry<ViableType, Long> entry : collect.entrySet()){
                System.out.println(entry.getKey().name() + " " + entry.getValue());
            }
            System.out.println();
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
         ScheduledExecutorService scheduledExecutorService =  Executors.newSingleThreadScheduledExecutor(element ->{
            Thread thread = new Thread(element);
            thread.setDaemon(true);
            return thread;
        });
        for (List<Cell> cellList : land.getCells()){
            Runnable cellTack = () -> {
                for (Cell cell :cellList){
                    List<NatureObject> objectList = cell.getObjectList();
                    for (NatureObject entity : objectList){
                        if (entity instanceof Fauna fauna){
                            killCoordinator.killOnCell(cell, fauna);
                            reproduceCoordinator.reproduceOnCell(cell, fauna);
                            moveCoordinator.move(land, cell, fauna);
                        }
                    }
                }
            };
            executorService.submit(cellTack);
        }
        scheduledExecutorService.scheduleWithFixedDelay(scheduleTask, 5, 9, TimeUnit.SECONDS);
        executorService.shutdown();
    }


    private Land initLand(MapSet mapSet){
        Land land = new Land();
        for (int i = 0; i < mapSet.getX(); i++) {
            land.getCells().add(new ArrayList<>());
            for (int j = 0; j < mapSet.getY(); j++) {
                land.getCells().get(i).add(new Cell(i, j));

            }
        }
        return land;
    }
}
