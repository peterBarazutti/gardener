package com.peterbarazutti.Plants;

import com.peterbarazutti.Simulation.Substances;

public abstract class Plant {

    private String identifier;
    private int size;
    private int maxSize;
    private boolean alive;

    public Plant(String identifier, int size, int maxSize) {
        this.identifier = identifier;
        this.size = size;
        this.maxSize = maxSize;
        this.alive = true;
    }

    public abstract void reactToSubstance(Substances substance);

    public void checkSize() {
        if (size <= 0 || size >= maxSize) {
            alive = false;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void modifySize(int modifier){
        size += modifier;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " - identifier=" + identifier  +
                ", alive=" + alive;
    }
}

