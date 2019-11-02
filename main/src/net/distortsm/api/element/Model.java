package net.distortsm.api.element;

public class Model {

    public boolean physicalCollision;
    public LODShape lodShape;
    public LODShapeFar lodShapeFar;
    public CollisionShape blockShape;
    public boolean useAstroCollision;
    public CollisionShape astroCollisionShape;

    public Model(LODShape lodShape, boolean physicalCollision, LODShapeFar lodShapeFar, CollisionShape blockShape, CollisionShape astroCollisionShape) {
        this.physicalCollision = physicalCollision;
        this.lodShape = lodShape;
        this.lodShapeFar = lodShapeFar;
        this.blockShape = blockShape;
        if(astroCollisionShape != null) {
            useAstroCollision = true;
        }
        this.astroCollisionShape = astroCollisionShape;
    }
}
