package net.distortsm.test;

import net.distortsm.api.element.*;

public class CaptainsChair extends Block {
    public CaptainsChair() {
        this.mass = 0.1;
        this.volume = 0.15;
        this.armor = 1.5;
        this.HP = 150;
        this.price = 300;
        this.activatable = false;
        this.enterable = true;
        this.bakeTime = 5.0;
        this.orientable = true;
        this.description = "A seat for a ship's commanding officer. It is not a replacement for a ship core, rather it acts more like a build block.";
        this.hasLODModel = true;
        this.model = new Model(new LODShape(),true, LODShapeFar.SOLID, CollisionShape.CUSTOM, CollisionShape.CUSTOM);
    }
}
