package com.peterbarazutti.Plants;

import com.peterbarazutti.Simulation.Substances;

public class Cactus extends Plant {

    private static final int MAXSIZE = 4;

    public Cactus(String identifier, int size) {
        super(identifier, size, MAXSIZE);
    }

    @Override
    public void reactToSubstance(Substances substance) {
        if (isAlive()) {
            switch (substance){
                case WATER:
                    modifySize(-1);
                    break;
                case NUTRIENT_SOLUTION:
                    modifySize(1);
                    break;
                case FERTILIZER:
                    modifySize(1);
                    break;
                case NOTHING:
                    modifySize(-1);
                    break;
            }
        }
        checkSize();
    }
}
