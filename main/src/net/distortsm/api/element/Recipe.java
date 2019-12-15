package net.distortsm.api.element;

import java.util.Map;

public class Recipe {

    private double bakeTime = 0;
    private int numberProduced = 0;
    private Map<Block, Integer> ingredients = null;

    public Recipe(double recipeBakeTime, int recipeNumberProduced) {
        this.bakeTime = recipeBakeTime;
        this.numberProduced = recipeNumberProduced;
    }

    public double getBakeTime() {
        return this.bakeTime;
    }

    public void setBakeTime(double bakeTime) {
        this.bakeTime = bakeTime;
    }

    public int getNumberProduced() {
        return this.numberProduced;
    }

    public void setNumberProduced(int numberProduced) {
        this.numberProduced = numberProduced;
    }

    public Map<Block, Integer> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(Map<Block, Integer> ingredients) {
        this.ingredients = ingredients;
    }
}
