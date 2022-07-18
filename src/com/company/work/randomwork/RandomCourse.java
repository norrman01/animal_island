package com.company.work.randomwork;
import com.company.exemplar.Cell;
import com.company.exemplar.enums.Course;
import com.company.operation.RandomOperation;
import com.company.work.ReferralService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RandomCourse {

    ReferralService referralService = new ReferralService();
    RandomOperation randomOperation = RandomOperation.getRandomOperation();

    public Course chooseRandomCourse (Cell cell, int speed){
        List <Course> courses = referralService.chooseCorrectCourse(cell, speed);
        ThreadLocalRandom random = randomOperation.getRandom();
        int i = random.nextInt(0, courses.size());
        return courses.get(i);
    }
}
