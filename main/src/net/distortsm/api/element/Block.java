package net.distortsm.api.element;

import java.util.List;

public class Block extends Element {
	public ElementType elementType = ElementType.BLOCK;
	public int HP = 0;
	public double armor = 0;
	public int price = 0;
	public String description = "";
	public double heatValue = 0;
	public double kineticValue = 0;
	public double emValue = 0;
	public double factoryBakeValue = 0;
	public int numberProduced = 0;
	public boolean animated = false;
	public boolean transparent = false;
	public boolean placeable = true;
	public Block controller = null;
	public List<Integer> textureIDs = null;
	public List<Block> controlling = null;
	public List<Block> controllers = null;
	public boolean orientable = false;
	public boolean enterable = false;
	public double mass = 0;
	public double volume = 0;
	public boolean hasAcivationTexture = false;
	public boolean activatable = false;
	public boolean physical = false;
	public boolean buildmode = false;
	public boolean lightSource = false;
	public List<Double> lightColors = null;
	public boolean door = false;
	public boolean hasLODModel = false;
	public Model model = null;
}