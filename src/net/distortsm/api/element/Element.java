package net.distortsm.api.element;

import java.util.ArrayList;

public class Element {
	
	private static String ID;
	private static int iconID;
	private static Category category;
	private static String displayName;
	private static ArrayList<Element> recipe = new ArrayList<Element>();
	private static boolean inShop;
	private static boolean placeable;
	private static boolean inRecipe;
	private static int price;
	private static String description;
	private static double bakeTime;
	private static int numberProduced;
	
	//Getters
	public static String getID() {
		/**
		 * Returns the element's ID as a String.
		 */
		return ID;
	}
	
	public static int getIconID() {
		/**
		 * Returns the element's Icon ID as an int.
		 */
		return iconID;
	}
	
	public static Category getCategory() {
		/*
		 *  Returns the element's category as a Category object.
		 */
		return category;
	}
	
	public static String getDisplayName() {
		/*
		 *  Returns the element's Display Name as a string.
		 */
		return displayName;
	}
	
	public static ArrayList<Element> getRecipe() {
		/*
		 *  Returns the elements in the recipe as an Element ArrayList.
		 */
		return recipe;
	}
	
	public static boolean inShop() {
		/*
		 *  Returns the status of if an element is set to appear in shops.
		 */
		return inShop;
	}
	
	public static boolean placeable() {
		/*
		 *  Returns the status of an element's placeability. For items this should always be false, for blocks it should be true.
		 */
		return placeable;
	}
	
	public static boolean inRecipe() {
		/*
		 *  Returns the status of if an element can be crafted through a recipe.
		 */
		return inRecipe;
	}
	
	public static int getPrice() {
		/*
		 *  Returns the price of an element.
		 */
		return price;
	}
	
	public static String getDescription() {
		/*
		 *  Returns the description of an element.
		 */
		return description;
	}
	
	public static double getBakeTime() {
		/*
		 * Returns the element's bake time (how long it takes to produce in a factory).
		 */
		return bakeTime;
	}
	
	public static int getNumberProduced() {
		/*
		 * Returns how many of the element are produced after it is manufactured.
		 */
		return numberProduced;
	}
	
	
	
	//Setters
	public static void setID(String id) {
		/*
		 * Sets the ID of the element.
		 */
		ID = id;
	}

	public static void setIconID(int id) {
		/*
		 * Sets the Icon ID of the element.
		 */
	    iconID = id;
	}

	public static void setCategory(Category cat) {
		/*
		 * Sets the element's category.
		 */
		category = cat;
	}

	public static void setDisplayName(String name) {
		/*
		 * Sets the element's display name.
		 */
		displayName = name;
	}
	

	public static void setRecipe(ArrayList<Element> elements) {
		/*
		 * Sets the element's recipe.
		 */
		recipe = elements;
	}
	
	public static void setPrice(int shopPrice) {
		/*
		 * Sets the price of the element in trading guild stick shops.
		 */
		price = shopPrice;
	}

	public static void setDescription(String desc) {
		/*
		 * Sets the description of the element.
		 */
		description = desc;
	}

	public static void setBakeTime(double time) {
		/*
		 * Sets the element's bake time (how long it takes to produce in a factory).
		 */
		bakeTime = time;
	}

	public static void setNumberProduced(int produced) {
		/*
		 * Sets how many of the element are produced after it is manufactured.
		 */
		numberProduced = produced;
	}
	
	public static void setInShop(boolean bool) {
		/*
		 * Sets if an element can be purchased in a shop.
		 */
		inShop = bool;
	}
	
	public static void setPlaceable(boolean bool) {
		/*
		 * Sets if an element can be placed. For items this should always be false, for blocks this should be true.
		 */
		placeable = bool;
	}
	
	public static void setInRecipe(boolean bool) {
		/*
		 * Sets if an element can be produced through a recipe.
		 */
		inRecipe = bool;
	}
}