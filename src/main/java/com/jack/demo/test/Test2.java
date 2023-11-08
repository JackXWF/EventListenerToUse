package com.jack.demo.test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {
        Map<String, Food> map = new HashMap<>();

        FoodHandler.setFoodName();

       /* map.put("test", (a, b) -> FoodHandler.getFoodName());

        System.out.printf(map.get("test").eatFood("1", "2"));*/


        map.put("test", new Food() {
            @Override
            public String makeFood(String c, String v) {
                return c+v;
            }

            @Override
            public String eatFood(String a, String b) {
                return a+"---"+b;
            }
        });


        System.out.println(map.get("test").makeFood("1","2"));

        System.out.println(map.get("test").eatFood("1","2"));

    }
}
