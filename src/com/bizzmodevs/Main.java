package com.bizzmodevs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Restaurant> RestaurantList = new ArrayList<>();

    public static void main(String[] args) {

        //INIT DEFAULT RESTAURANTS
        Restaurant r1 = new Restaurant("PizzeriaGdynianka", 5,2,true);
        RestaurantList.add(r1);
        Restaurant r2 = new Restaurant("ZapiekankiPodMostem", 1, 0, false);
        RestaurantList.add(r2);

        System.out.println("Hello!");
        System.out.println("Available restaurants list below:");

        for ( Restaurant r : RestaurantList) {
            System.out.println(r.restaurantName);
        }


    }
}
