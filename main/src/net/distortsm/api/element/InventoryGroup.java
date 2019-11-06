package net.distortsm.api.element;

import java.util.ArrayList;

public class InventoryGroup {

    private String name;
    private ArrayList<Block> blocks = new ArrayList<Block>();

    public InventoryGroup(String name) {
        this.name = name;
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }

    public void addBlock(Block block) {
        this.blocks.add(block);
    }
}
