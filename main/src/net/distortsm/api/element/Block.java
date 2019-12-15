package net.distortsm.api.element;

import net.distortsm.api.main.BlockRegistry;
import java.util.List;

public class Block extends Element {

    private int HP = 0;
    private double armor = 0;
    private int price = 0;
    private double heatValue = 0;
    private double kineticValue = 0;
    private double emValue = 0;
    private boolean animated = false;
    private boolean transparent = false;
    private boolean placeable = true;
    private Block controller = null;
    private List<Integer> textureIDs = null;
    private List<Block> controlling = null;
    private List<Block> controllers = null;
    private boolean orientable = false;
    private boolean enterable = false;
    private double mass = 0;
    private double volume = 0;
    private boolean hasAcivationTexture = false;
    private boolean activatable = false;
    private boolean physical = true;
    private boolean drawOnlyInBuildMode = false;
    private boolean lightSource = false;
    private List<Double> lightColors = null;
    private boolean door = false;
    private InventoryGroup inventoryGroup = null;
    private BlockShape blockShape = BlockShape.FULL;
    private BlockType blockType = BlockType.DECORATION;
    private boolean hasLODModel = false;
    private CustomModel customModel = null;
    private int individualSides = 0;
    private boolean sideTexturesPointToOrientation = true;
    private boolean sensorInput = false;
    private boolean beacon = false;
    private boolean drawLogicConnection = false;
    private boolean mainCombination = false;
    private boolean supportCombination = false;
    private boolean effectCombination = false;

    public Block(int blockID, String blockName) {
        /**
         * Block(int blockID, String blockName)
         * - blockName refers to internal registry name, not display name
         */
        super(blockID, blockName);
    }

    public boolean isMainCombination() {
        return this.mainCombination;
    }

    public void setMainCombination(boolean bool) {
        this.mainCombination = bool;
    }

    public boolean isSupportCombination() {
        return this.supportCombination;
    }

    public void setSupportCombination(boolean bool) {
        this.supportCombination = bool;
    }

    public boolean isEffectCombination() {
        return this.effectCombination;
    }

    public void setEffectCombination(boolean bool) {
        this.effectCombination = bool;
    }

    public boolean isBeacon() {
        return this.beacon;
    }

    public void setBeacon(boolean bool) {
        this.beacon = bool;
    }

    public boolean isDrawLogicConnection() {
        return drawLogicConnection;
    }

    public void setDrawLogicConnection(boolean drawLogicConnection) {
        this.drawLogicConnection = drawLogicConnection;
    }

    public boolean hasSensorInput() {
        return this.sensorInput;
    }

    public void setSensorInput(boolean bool) {
        this.sensorInput = bool;
    }

    public boolean isSideTexturesPointToOrientation() {
        return this.sideTexturesPointToOrientation;
    }

    public void setSideTexturesPointToOrientation(boolean bool) {
        this.sideTexturesPointToOrientation = bool;
    }

    public CustomModel getCustomModel() {
        return this.customModel;
    }

    public void setCustomModel(CustomModel model) {
        this.customModel = model;
    }

    public BlockType getBlockType() {
        return blockType;
    }

    public void setBlockType(BlockType type) {
        this.blockType = type;
    }

    public BlockShape getBlockShape() {
        return blockShape;
    }

    public void setBlockShape(BlockShape shape) {
        this.blockShape = shape;
    }

    public int getHP() {
        return this.HP;
    }

    public void setHP(int value) {
        this.HP = value;
    }

    public double getArmor() {
        return this.armor;
    }

    public void setArmor(double value) {
        this.armor = value;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int value) {
        this.price = value;
    }

    public double getHeatValue() {
        return this.heatValue;
    }

    public void setHeatValue(double value) {
        this.heatValue = value;
    }

    public double getKineticValue() {
        return this.kineticValue;
    }

    public void setKineticValue(double value) {
        this.kineticValue = value;
    }

    public double getEmValue() {
        return this.emValue;
    }

    public void setEmValue(double value) {
        this.emValue = value;
    }

    public boolean isAnimated() {
        return this.animated;
    }

    public void setAnimated(boolean bool) {
        this.animated = bool;
    }

    public boolean isTransparent() {
        return this.transparent;
    }

    public void setTransparent(boolean bool) {
        this.transparent = bool;
    }

    public boolean isPlaceable() {
        return this.placeable;
    }

    public void setPlaceable(boolean bool) {
        this.placeable = bool;
    }

    public Block getController() {
        return this.controller;
    }

    public void setController(Block controllerBlock) {
        this.controller = controllerBlock;
    }

    public List<Integer> getTextureIDs() {
        return this.textureIDs;
    }

    public void setTextureIDs(List<Integer> blockTextureIDs) {
        this.textureIDs = blockTextureIDs;
        this.individualSides = blockTextureIDs.size();
    }

    public List<Block> getControlling() {
        return controlling;
    }

    public void setControlling(List<Block> controllingBlocks) {
        this.controlling = controllingBlocks;
    }

    public List<Block> getControllers() {
        return this.controllers;
    }

    public void setControllers(List<Block> controllersBlocks) {
        this.controllers = controllersBlocks;
    }

    public boolean isOrientable() {
        return this.orientable;
    }

    public void setOrientable(boolean bool) {
        this.orientable = bool;
    }

    public boolean isEnterable() {
        return this.enterable;
    }

    public void setEnterable(boolean bool) {
        this.enterable = bool;
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double value) {
        this.mass = value;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double value) {
        this.volume = value;
    }

    public boolean hasAcivationTexture() {
        return this.hasAcivationTexture;
    }

    public void setHasAcivationTexture(boolean bool) {
        this.hasAcivationTexture = bool;
    }

    public boolean isActivatable() {
        return this.activatable;
    }

    public void setActivatable(boolean bool) {
        this.activatable = bool;
    }

    public boolean isPhysical() {
        return this.physical;
    }

    public void setPhysical(boolean bool) {
        this.physical = bool;
    }

    public boolean isDrawOnlyInBuildMode() {
        return this.drawOnlyInBuildMode;
    }

    public void setDrawOnlyInBuildmode(boolean bool) {
        this.drawOnlyInBuildMode = bool;
    }

    public boolean isLightSource() {
        return this.lightSource;
    }

    public void setLightSource(boolean blockLightSource) {
        this.lightSource = blockLightSource;
    }

    public List<Double> getLightColors() {
        return this.lightColors;
    }

    public void setLightColors(List<Double> blockLightColors) {
        this.lightColors = blockLightColors;
    }

    public boolean isDoor() {
        return this.door;
    }

    public void setDoor(boolean bool) {
        this.door = bool;
    }

    public boolean hasLODModel() {
        return this.hasLODModel;
    }

    public void setHasLODModel(boolean bool) {
        this.hasLODModel = bool;
    }

    public InventoryGroup getInventoryGroup() {
        return this.inventoryGroup;
    }

    public void setInventoryGroup(InventoryGroup blockInventoryGroup) {
        this.inventoryGroup = blockInventoryGroup;
    }

    public void registerBlock() {
        BlockRegistry.registerBlock(this);
    }
}