package net.distortsm.api.element;

import java.util.ArrayList;

public class Block extends Element {
	private static int HP;
	private static int armor;
	private static int price;
	private static String description;
	private static int heatValue;
	private static int kineticValue;
	private static int emValue;
	private static double factoryBakeValue;
	private static int numberProduced;
	private static boolean animated;
	private static boolean transparent;
	private static Block controller;
	private static ArrayList<Integer> textureIDs = new ArrayList<Integer>();
	private static ArrayList<Block> controlling = new ArrayList<Block>();
	private static ArrayList<Block> controllers = new ArrayList<Block>();
	private static boolean orientable;
	private static boolean enterable;
	private static int mass;
	private static int volume;
	private static int hitpoints;
	private static boolean hasAcivationTexture;
	private static boolean activatable;
	private static boolean physical;
	private static boolean buildmode;
	private static boolean lightSource;
	private static ArrayList<Double> lightColors = new ArrayList<Double>();
	private static boolean door;
	
	public Block() {
		elementType = ElementType.BLOCK;
	}

	public static void setTextureIDs(ArrayList<Integer> ids) {
		if(ids.size() == 6) {
	      for(int x = 0; x <= ids.size(); x++) {
	        textureIDs.add(x);
	      }
	    }
	}

	  public static void setHitpoints(int hitPoints) {
	    int HP = hitPoints;
	  }

	  public static void setArmor(int armorPoints) {
	    int armor = armorPoints;
	  }

	  public static void setAnimated(boolean bool) {
	    boolean animated = bool;
	  }

	  public static void setTransparent(boolean bool) {
	    boolean transparent = bool;
	  }

	  public static void setMaster(Block block) {
	    Block controller = block;
	  }

	  public static void setSlaves(ArrayList<Block> blocks) {
	    controlling.addAll(blocks);
	  }

	  public static void setOrientable(boolean bool) {
	    boolean orientable = bool;
	  }

	  public static void setEnterable(boolean bool) {
	    boolean enterable = bool;
	  }

	  public static void setMass(int weight) {
	    int mass = weight;
	  }

	  public static void setVolume(int vol) {
	    int volume = vol;
	  }

	  public static void setPlaceable(boolean bool) {
	    boolean placeable = bool;
	  }

	  public static void setActivateable(boolean bool) {
	    boolean activatable = bool;
	    boolean hasAcivationTexture = bool;
	  }

	  public static void setPhysical(boolean bool) {
	    boolean physical = bool;
	  }

	  public static void setOnlyVisibleBuildmode(boolean bool) {
	    boolean buildmode = bool;
	  }

	  public static void setEmitsLight(boolean bool) {
	    boolean lightSource = bool;
	  }

	  public static void setLightSourceColor(ArrayList<Double> colors) {
	    lightColors.addAll(colors);
	  }

	  public static void setDoor(boolean bool) {
	    boolean door = bool;
	  }
}
