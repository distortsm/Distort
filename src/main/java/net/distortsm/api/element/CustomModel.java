package net.distortsm.api.element;

public class CustomModel {

    private String modelFile;
    private ActivationAnimationStyle animationStyle = null;
    private CustomModel modelSwitch;

    public CustomModel(String model) {
        this.modelFile = model;
    }

    public CustomModel(String model, CustomModel modelToSwitch) {
        this.modelFile = model;
        this.animationStyle = ActivationAnimationStyle.MODELSWAP;
        this.modelSwitch = modelToSwitch;
    }
}
