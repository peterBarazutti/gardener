package com.peterbarazutti.Simulation;

import com.peterbarazutti.Plants.Bush;
import com.peterbarazutti.Plants.Cactus;
import com.peterbarazutti.Plants.Flower;
import com.peterbarazutti.Plants.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gardener {

    public static void main(String[] args) {

        List<Plant> plantList = new ArrayList<>();

        int NUMBER_OF_DAYS = 5;

        plantList.add(new Flower("V102", 3));
        plantList.add(new Bush("B223", 4));
        plantList.add(new Cactus("K15", 2));
        plantList.add(new Cactus("K18", 1));

        Random random = new Random();
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            Substances substance = Substances.values()[random.nextInt(4)];
            for (Plant plant: plantList) {
                plant.reactToSubstance(substance);
            }
        }

        for (Plant plant:plantList) {
            System.out.println(plant);
        }
    }

}
