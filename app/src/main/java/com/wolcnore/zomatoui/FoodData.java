package com.wolcnore.zomatoui;

public class FoodData {

    String foodName;
    int foodImage;

    public FoodData() {
    }

    public FoodData(String foodName, int foodImage) {
        this.foodName = foodName;
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }
}
