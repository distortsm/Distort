package net.distortsm.api.main;

import net.distortsm.api.block.Block;
import net.distortsm.api.entity.Entity;
import net.distortsm.api.world.Location;

public class Tools {

  public static getDistance(Block block1, Block block2) {
    /** gets the distance between 2 blocks on an entity */
    int distx = abs(block1.getx - block2.getx);
    int disty = abs(block1.gety - block2.gety);
    int distz = abs(block1.getz - block2.getz);
    float vector = Vector3d(distx, disty, distz);
    return vector;
  }

  public static spaceCheck(Block point1, Block point2, Entity entity, Block[] blocks) {
    /** check for specific blocks within 2 points of space on an entity */
    int distx = abs(block1.getx() - block2.getx());
    int disty = abs(block1.gety() - block2.gety());
    int distz = abs(block1.getz() - block2.getz());

    for(int z = 0, z <= distz, z++) {
      for(int y = 0, y <= disty, y++) {
        for(int x = 0, x <= distx, x++) {
          int currentBlockx = block1.getx() + x;
          int currentBlocky = block1.gety();
          int currentBlockz = block1.getz();
          Location currentBlockLocation = currentBlockx, currentBlocky, currentBlockz;
          if(blocks.contains(currentBlockLocation.getBlock)) {
            return true;
          }
        }
      }
    }
  }
}
