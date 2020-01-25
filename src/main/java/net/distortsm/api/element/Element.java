package net.distortsm.api.element;

public class Element {

    private int blockID;
    private String blockName;
    private String fullName;
    private String description;
    private boolean inShop = false;
    private boolean inRecipe = false;
    private boolean deprecated = false;
    private int buildIcon;
    private Recipe recipe = null;

    public Element(int elementID, String elementName) {
        this.blockID = elementID;
        this.blockName = elementName;
    }

    public Recipe getRecipe() {
        return this.recipe;
    }

    public void setRecipe(Recipe blockRecipe) {
        this.recipe = blockRecipe;
    }

    public int getID() {
        return this.blockID;
    }

    public String getName() {
        return this.blockName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String string) {
        this.fullName = string;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String string) {
        this.description = string;
    }

    public boolean isInShop() {
        return inShop;
    }

    public void setInShop(boolean bool) {
        this.inShop = bool;
    }

    public boolean isInRecipe() {
        return inRecipe;
    }

    public void setInRecipe(boolean bool) {
        this.inRecipe = bool;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean bool) {
        this.deprecated = bool;
    }

    public int getBuildIcon() {
        return buildIcon;
    }

    public void setBuildIcon(int value) {
        this.buildIcon = value;
    }
}