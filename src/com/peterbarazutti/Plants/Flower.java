package com.peterbarazutti.Plants;

import com.peterbarazutti.Simulation.Substances;

public class Flower extends Plant {
    private static final int MAXSIZE = 6;

    public Flower(String identifier, int size) {
        super(identifier, size, MAXSIZE);
    }

    @Override
    public void reactToSubstance(Substances substance) {
        if (isAlive()) {
            switch (substance){
                case WATER:
                    modifySize(3);
                    break;
                case NUTRIENT_SOLUTION:
                    modifySize(-1);
                    break;
                case FERTILIZER:
                    modifySize(-1);
                    break;
                case NOTHING:
                    modifySize(-1);
                    break;
            }
        }
        checkSize();
    }
}
