package com.levochka108.SpringAppToyStory.service;

import com.levochka108.SpringAppToyStory.model.Toy;
import org.springframework.stereotype.Service;

import java.util.PriorityQueue;
import java.util.Random;

@Service
public class ToyStory implements ToyStoreService{
    private PriorityQueue<Toy> toyQueue;

    public ToyStory() {
        toyQueue = new PriorityQueue<>();
    }

    public void addToy(Toy toy) {
        toyQueue.offer(toy);
    }

    public Toy getRandomToy() {
        if (toyQueue.isEmpty()) {
            return null;
        }

        int totalWeight = 0;
        for (Toy toy : toyQueue) {
            totalWeight += toy.getWeight();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(totalWeight) + 1;

        int currentWeight = 0;
        for (Toy toy : toyQueue) {
            currentWeight += toy.getWeight();
            if (randomNumber <= currentWeight) {
                return toy;
            }
        }
        return null;
    }
}


