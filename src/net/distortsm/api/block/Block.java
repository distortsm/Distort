package net.distortsm.api.block;

import java.util.ArrayList;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import net.distortsm.api.main.Main;

public class Block {

  public static final String starmadeDirectory = Main.starmadeDirectory;
  public static final String blockXMLFilePath = starmadeDirectory + "customBlockConfig/BlockConfigImport.xml";

  public static DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
  public static DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
  public static Document document = documentBuilder.newDocument();
  public static Element config;
  public static Element element;
  public static Element general;
  public static Block block = new Block();
  public static ArrayList<Block> customBlocks = new ArrayList<Block>();

  private static String blockID;
  private static int blockIconID;
  private static Element category;
  private static String displayName;
  private static ArrayList<Integer> textureIDs = new ArrayList<Integer>();
  private static ArrayList<Block> recipe = new ArrayList<Block>();
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
  private static ArrayList<Block> controlling = new ArrayList<Block>();
  private static boolean inShop;
  private static boolean orientable;
  private static boolean enterable;
  private static int mass;
  private static int volume;
  private static int hitpoints;
  private static boolean placeable;
  private static boolean inRecipe;
  private static boolean hasAcivationTexture;
  private static boolean activatable;
  private static boolean physical;
  private static boolean buildmode;
  private static boolean lightSource;
  private static ArrayList<Double> lightColors = new ArrayList<Double>();
  private static boolean door;

  public static void createCategory(String categoryName) {
    Element category = document.createElement("" + categoryName);
    general.appendChild(category);
  }

  public static void setBlockID(String id) {
    String blockID = id;
  }

  public static void setBlockIconID(int id) {
    int blockIconID = id;
  }

  public static void setCategory(Element cat) {
    Element category = cat;
  }

  public static void setDisplayName(String name) {
    String displayName = name;
  }

  public static void setTextrueIDs(ArrayList<Integer> ids) {
    if(ids.size() == 6) {
      for(int x = 0; x <= ids.size(); x++) {
        textureIDs.add(x);
      }
    }
  }

  public static void setRecipe(ArrayList<Block> blocks) {
	  for(int x = 0; x <= blocks.size(); x++) {
	        boolean inRecipe = true;
	        recipe.add(x);
	      }
  }

  public static void setHitpoints(int hitPoints) {
    int HP = hitPoints;
  }

  public static void setArmor(int armorPoints) {
    int armor = armorPoints;
  }

  public static void setPrice(int shopPrice) {
    int price = shopPrice;
  }

  public static void setDescription(String desc) {
    String description = desc;
  }

  public static void setBakeTime(double time) {
    double factoryBakeValue = time;
  }

  public static void setNumberProduced(int produced) {
    int numberProduced = produced;
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

  public static void setSlaves(ArrayList<Integer> blocks) {
    for(x = 0, x <= blocks.size(), x++) {
      controlling.add(x);
    }
  }

  public static void inShop(boolean bool) {
    boolean inShop = bool;
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
    if(colors.size == 3) {
      for(x = 0, x <= ids.size(), x++) {
        lightColors.add(x);
      }
    }
  }

  public static void setDoor(boolean bool) {
    boolean door = bool;
  }

  public static void saveConfigs() throws TransformerConfigurationException {
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new File("" + blockXMLFilePath));
  }

  public static void registerConfigs(Block block) {
	  try {
		  Element config = document.createElement("Config");
		  document.appendChild(config);
		    Element element = document.createElement("Element");
		    config.appendChild(element);
		    Element general = document.createElement("General");
		    element.appendChild(general);
		    Element category = block.category;
		    element.appendChild(category);
		    Element blockElement = document.createElement("Block");
		    blockElement.setAttribute("icon", "" + blockIconID);
		    blockElement.setAttribute("name", "" + displayName);
		    blockElement.setAttribute("textureId", "" + textureIDs[0] + "," + textureIDs[1] + "," + textureIDs[2] + "," + textureIDs[3] + "," + textureIDs[4] + "," + textureIDs[5] + ",");
		    blockElement.setAttribute("type", "" + blockID);
		    category.appendChild(blockElement);

		    //Recipe
		    Element recipeElement = document.createElement("Consistence");
		    blockElement.appendChild(recipeElement);

		    //Armor Value
		    Element armorElement = document.createElement("ArmorValue");

		    //Effect Armor
		    Element effectArmorElement = document.createElement("EffectArmor");
		    blockElement.appendChild(effectArmorElement);

		    //Heat Armor
		    Element heatElement = document.createElement("Heat");
		    effectArmorElement.appendChild(heatElement);
		    Element heatStat = document.createTextNode("" + heatValue));
		    heatElement.appendChild(heatStat);

		    //Kinetic Armor
		    Element kineticElement = document.createElement("Kinetic");
		    effectArmorElement.appendChild(kineticElement);
		    Element kineticStat = document.createTextNode("" + kineticValue));
		    heatElement.appendChild(kineticStat);

		    //Em Armor
		    Element emElement = document.createElement("EM");
		    effectArmorElement.appendChild(emElement);
		    Element emStat = document.createTextNode("" + emValue));
		    heatElement.appendChild(kineticStat);

		    //Price
		    Element priceElement = document.createElement("Price");
		    block.appendChild(priceElement);

		    //Description
		    Element descriptionElement = document.createElement("Description");
		    block.appendChild(descriptionElement);
		    Element descText = document.createTextNode("" + description);
		    descriptionElement.appendChild(descriptionText);

		    //Block Resource Type
		    //Ask Schema what this means

		    //Number Produced in Factory
		    Element producedElement = document.createElement("ProducedInFactory");
		    block.appendChild(descriptionElement);
		    Element producedText = document.createTextNode("" + numberProduced);
		    producedElement.appendChild(producedText);

		    //Basic Resources Factory
		    //Ask Schema what this means

		    //Factory Bake Time
		    Element factoryTimeElement = document.createElement("FacoryBakeTime");
		    block.appendChild(factoryTimeElement);
		    Element factoryTimeText = document.createTextNode("" + factoryBakeValue);
		    factoryTimeElement.appendChild(factoryTimeText);

		    //Inventory Group
		    //Ask Schema if it is possible to make new inventory groups through configs

		    //Animated
		    Element animatedElement = document.createElement("Animated");
		    block.appendChild(animatedElement);
		    Element animatedBool = document.createTextNode("" + animated);
		    animatedElement.appendChild(animatedBool);

		    //StructureHPContribution
		    //Probably has to do with integrity mechanic, ignore it for now because integrity is disabled by default
		    //(Maybe add support in future?)

		    //Transparency
		    Element transparencyElement = document.createElement("Transparency");
		    block.appendChild(transparencyElement);
		    Element transText = document.createTextNode("" + transparent);
		    transparencyElement.appendChild(transText);

		    //In Shop
		    //If the block can be purchased
		    Element shopElement = document.createElement("InShop");
		    block.appendChild(shopElement);
		    Element shopText = document.createTextNode("" + inShop);
		    shopElement.appendChild(shopText);

		    //Orientation
		    //Allows block to change orientation
		    Element orientationElement = document.createElement("Orientation");
		    block.appendChild(orientationElement);
		    Element orientationText = document.createTextNode("" + orientable);
		    orientationElement.appendChild(orientationText);

		    //Block Computer Reference
		    //Ask Schema what this means

		    //Slab
		    //0 = full block, 1 = 1/4 block?, 2 = 1/2 block?, 3 = 3/4 block?
		    //Ask Schema if above is correct

		    //Slab IDs
		    //Probably referring to slab block icon ids
		    //Double check with Schema to see if true

		    //Slab Reference
		    //Ask Schema what this means

		    //GeneralChamber
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Capacity
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Root
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Parent
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Upgrades To
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Permission
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Prerequisites
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Mutually Exclusive
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Children
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Chamber Applies To
		    //Has to do with chamber blocks, ignore for now
		    //(Maybe add support in future?)

		    //Reactor HP
		    //Has to do with reactor blocks, ignore for now
		    //(Maybe add support in future?)

		    //Reactor General Icon Index
		    //Has to do with reactor blocks, ignore for now
		    //(Maybe add support in future?)

		    //Enterable
		    //Allows for the block to be entered by the player, for weapon computers and such
		    Element enterableElement = document.createElement("Enterable");
		    block.appendChild(enterableElement);
		    Element enterableText = document.createTextNode("" + enterable);
		    enterableElement.appendChild(enterableText);

		    //Mass
		    //The block's mass
		    Element massElement = document.createElement("Mass");
		    block.appendChild(massElement);
		    Element massText = document.createTextNode("" + mass);
		    massElement.appendChild(massText);

		    //Volume
		    //How much storage space the block takes up
		    Element volumeElement = document.createElement("Volume");
		    block.appendChild(volumeElement);
		    Element volumeText = document.createTextNode("" + volume);
		    volumeElement.appendChild(volumeText);

		    //Hitpoints
		    //How much HP the block has, seperate from armor value
		    Element hitpointsElement = document.createElement("Hitpoints");
		    block.appendChild(hitpointsElement);
		    Element hitpointsText = document.createTextNode("" + hitpoints);
		    hitpointsElement.appendChild(hitpointsText);

		    //Placeable
		    //If the player is allowed to physically place the block
		    //For items and tools change this to false
		    Element placeableElement = document.createElement("Placeable");
		    block.appendChild(placeableElement);
		    Element placeableText = document.createTextNode("" + placeable);
		    placeableElement.appendChild(placeableText);

		    //In Recipe
		    //If it's actually craftable or not
		    Element inRecipeElement = document.createElement("InRecipe");
		    block.appendChild(inRecipeElement);
		    Element inRecipeText = document.createTextNode("" + inRecipe);
		    inRecipeElement.appendChild(inRecipeText);



		    //Individual Sides
		    //Ask Schema what this means

		    //Side Textures Point to Oreintation
		    //Ask Schema what this means

		    //Can Activate
		    //If the block can be activated like a logic block
		    Element activationElement = document.createElement("CanActivate");
		    block.appendChild(activationElement);
		    Element activationTextureText = document.createTextNode("" + activatable);
		    activationElement.appendChild(activationText);

		    //Has Acivation Texture
		    //If the block changes texture on activation like a logic block
		    Element activationTextureElement = document.createElement("HasAcivationTexture");
		    block.appendChild(activationTextureElement);
		    Element activationTextureText = document.createTextNode("" + hasAcivationTexture);
		    activationTextureElement.appendChild(activationTextureText);

		    //Physical
		    //If the block can be passed through by other entities
		    //(true = not passable)
		    Element physicalElement = document.createElement("Physical");
		    block.appendChild(physicalElement);
		    Element physicalText = document.createTextNode("" + physical);
		    physicalElement.appendChild(physicalText);

		    //Block Style
		    //Ask Schema what this means

		    //Light Source
		    //If the block emits light
		    Element lightElement = document.createElement("LightSource");
		    block.appendChild(lightElement);
		    Element lightText = document.createTextNode("" + lightSource);
		    lightElement.appendChild(lightText);

		    //Light Source Color
		    //The color of the block's light source
		    Element lightColorElement = document.createElement("LightSourceColor");
		    block.appendChild(lightElement);
		    Element lightColorText = document.createTextNode("" + lightColor[0] + "," + lightColor[1] + "," + lightColor[2]);
		    lightColorElement.appendChild(lightColorText);

		    //Door
		    //If the block is a door
		    Element doorElement = document.createElement("Door");
		    block.appendChild(doorElement);
		    Element doorText = document.createTextNode("" + door);
		    doorElement.appendChild(doorText);

		    //Sensor Input
		    //If the block can output to a sensor
		    //Ask Schema how this works

		    //Resource Injection
		    //Ask Schema what this means

		    //Explosion Absorbtion
		    //Ask Schema what this means

		    //Extended Texture 4x4
		    //Has to do with extended textures, ignore for now
		    //(Maybe add suport in future?)

		    //Only Drawn in Build Mode
		    //For blocks that are only visible in build mode, like area blocks and rail launchers
		    Element buildmodeElement = document.createElement("OnlyDrawnInBuildMode");
		    block.appendChild(buildmodeElement);
		    Element buildmodeText = document.createTextNode("" + buildmode);
		    buildmodeElement.appendChild(buildmodeText);

		    //LODS Shape from Far
		    //For LOD blocks, changes the block to be a certain shape when out of LOD range
		    //Ask Schema which values are which

		    //Low HP Setting
		    //Ask Schema what this means

		    //System Block
		    //If the block is a system block? Ask Schema what this means

		    //Controlled by
		    //The block that controls this block
		    Element controllerElement = document.createElement("ControlledBy");
		    block.appendChild(controllerElement);
		    Element controllerText = document.createTextNode("" + controller);
		    controllerElementText.appendChild(controllerText);

		    //Controlling
		    //The blocks that are controlled by this block
		    Element controllingElement = document.createElement("Controlling");
		    block.appendChild(controllingElement);
		    for(x = 0, x <= controlling.size(), x++) {
		      Element controllingElementText = document.createElement("Element");
		      controllingElement.appendChild(controllingElementText);
		      Element controllingText = document.createTextNode("" + controlling[x]);
		      controllingElementText.appendChild(controllingText);
		    }
		    saveConfigs();
		    System.out.println("Successfuly registered " + customBlocks.size() + " blocks!");
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
  }

  public static getEntity(Block block) {
    /** Gets the entity a block is on */
  }

  public static getx(Block block) {
    /** Gets x coordinate of a block on an entity */
  }

  public static gety(Block block) {
    /** Gets y coordinate of a block on an entity */
  }

  public static getz(Block block) {
    /** Gets z coordinate of a block on an entity */
  }

  public static getLocation(Block block) {
    /** Gets location of a block on an entity */
  }
}
