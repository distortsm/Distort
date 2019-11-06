package net.distortsm.api.element;

public class Recipe {

    private double bakeTime;
    private int numberProduced;

    public Recipe(double recipeBakeTime, int recipeNumberProduced) {
        this.bakeTime = recipeBakeTime;
        this.numberProduced = recipeNumberProduced;
    }
}
