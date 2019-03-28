package net.distortsm.api.entity;

import net.distortsm.api.block.Block;
import net.distortsm.api.world.Location;

public class Entity {

  public static Entity entity = new Entity();
  
  public static Block getBlockAt(Location[] location) {
    Block block;
    int blockx = location.locationCoords[0];
    int blocky = location.locationCoords[1];
    int blockz = location.locationCoords[2];

    //get the block at blockx, blocky, blockz

    return block;
  }
}
