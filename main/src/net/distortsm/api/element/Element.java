package net.distortsm.api.element;

import java.util.HashMap;

public class Element {
	
	public String ID;
	public int iconID;
	public Category category;
	public String displayName;
	public HashMap<Element, Integer> recipe = new HashMap<Element , Integer>();
	public boolean inShop;
	public boolean placeable;
	public boolean inRecipe;
	public int price;
	public String description;
	public double bakeTime;
	public int numberProduced;
	public ElementType elementType;
}