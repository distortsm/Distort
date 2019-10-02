package net.distortsm.api.element;

import java.util.List;

public class Block extends Element {
	public ElementType elementType = ElementType.BLOCK;
	public int HP;
	public int armor;
	public int price;
	public String description;
	public int heatValue;
	public int kineticValue;
	public int emValue;
	public double factoryBakeValue;
	public int numberProduced;
	public boolean animated;
	public boolean transparent;
	public boolean placeable;
	public Block controller;
	public List<Integer> textureIDs;
	public List<Block> controlling;
	public List<Block> controllers;
	public boolean orientable;
	public boolean enterable;
	public int mass;
	public int volume;
	public int hitpoints;
	public boolean hasAcivationTexture;
	public boolean activatable;
	public boolean physical;
	public boolean buildmode;
	public boolean lightSource;
	public List<Double> lightColors;
	public boolean door;
	
	public void register() {
		
	}
}