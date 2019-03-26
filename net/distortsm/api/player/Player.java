package net.distortsm.api.player;

import net.distortsm.api.server.Server;
import net.distortsm.api.guis.ErrorBox;
import net.distortsm.api.guis.MessageBox;
import net.distortsm.api.entity.Entity;
import net.distortsm.api.world.Sector;
import net.distortsm.api.world.System;

public class Player {

  public static Server server = new Server();
  public static Player player = new Player();
  public static Sector sector = new Sector();
  public static System system = new System();

  private static void sendErrorBox(ErrorBox errorBox) {
    if(server.getPlayer(player) == null) {
      System.out.println(player + " isn't on server! Cannot send ErrorBox");
    } else {
      //figure out how to send errorBox to a player
      System.out.println("Sent ErrorBox to " + player);
    }
  }

  private static void sendMessageBox(MessageBox messageBox) {
    if(server.getPlayer(player) == null) {
      System.out.println(player + " isn't on server! Cannot send MessageBox");
    } else {
      //figure out how to send messageBox to a player
      System.out.println("Sent MessageBox to " + player);
    }
  }

  public static getCurrentEntity(Player player) {
    /** Gets the current entity a player is aligned/attached to */
  }

  public static getSector(Player player) {
    /** Gets a player's current sector */

    return sector;
  }

  public static getSystem(Player player) {
    /** Gets a player's current system */
    
    return system;
  }

  public static getFaction(Player player) {
    /** Gets a player's current faction */
  }
}
