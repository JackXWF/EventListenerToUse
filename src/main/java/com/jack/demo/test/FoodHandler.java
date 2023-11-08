package com.jack.demo.test;

import lombok.Data;


public class FoodHandler {
    static String food;

    public static void setFoodName() {
        food = "炸洋芋";
    }

    public static String getFoodName() {
        return food;
    }


}
