package net.distortsm.api.element;

import java.util.HashMap;

public class Element {
	
	public int ID;
	public int iconID;
	public Category category;
	public String displayName;
	public HashMap<Element, Integer> recipe = new HashMap<Element , Integer>();
	public boolean inShop;
	public boolean placeable;
	public boolean inRecipe;
	public int price;
	public String description;
	public double bakeTime = 5.0;
	public int numberProduced;
	public ElementType elementType;

}