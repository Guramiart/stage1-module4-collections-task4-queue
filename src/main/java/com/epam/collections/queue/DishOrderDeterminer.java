package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishesQueue = new LinkedList<>();
        List<Integer> dishes = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishesQueue.add(i);
        }
        int i = 1;
        while (dishesQueue.size() != 0) {
            if(i != everyDishNumberToEat) {
                dishesQueue.add(dishesQueue.remove());
                i++;
            } else {
                dishes.add(dishesQueue.remove());
                i = 1;
            }
        }
        return dishes;
    }
}
