package com.company.operation;

import java.util.concurrent.ThreadLocalRandom;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RandomOperation {
    static RandomOperation randomOperation;
    ThreadLocalRandom random;

    public RandomOperation(ThreadLocalRandom random) {
        this.random = random;
    }

    public static RandomOperation getRandomOperation() {
        if (randomOperation == null) {
            synchronized (RandomOperation.class) {
                randomOperation = new RandomOperation(ThreadLocalRandom.current());

            }
        }
        return randomOperation;
    }
}
