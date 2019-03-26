package net.distortsm.api.player;

import java.lang.Object.Vector3i;
import org.schema.game.common.data.player.PlayerState;
import net.distortsm.api.server.Server;
import net.distortsm.api.guis.ErrorBox;
import net.distortsm.api.guis.MessageBox;
import net.distortsm.api.entity.Entity;
import net.distortsm.api.world.Sector;
import net.distortsm.api.world.System;
import net.distortsm.api.player.Faction;

public class Player extends PlayerState {

  public static Server server = new Server();
  public static Player player = new Player();
  private static String playerName = PlayerState.getName();
  public static Faction faction = new Faction();
  public static ArrayList<Integer> sector = new ArrayList<Integer>();
  public static ArrayList<Integer> system = new ArrayList<Integer>();

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
    int sectorX = PlayerState.currentSector.get(x);
    int sectorY = PlayerState.currentSector.get(y);
    int sectorZ = PlayerState.currentSector.get(z);
    sector.set(0, sectorX);
    sector.set(1, sectorY);
    sector.set(2, sectorZ);
    return sector;
  }

  public static getSectorX(Player player) {
    int sectorX = PlayerState.currentSector.get(x);
    return sectorX;
  }

  public static getSectorY(Player player) {
    int sectorY = PlayerState.currentSector.get(y);
    return sectorY;
  }

  public static getSectorZ(Player player) {
    int sectorZ = PlayerState.currentSector.get(z);
    return sectorZ;
  }

  public static getSystem(Player player) {
    /** Gets a player's current system */
    int systemX = PlayerState.currentSystem.get(x);
    int systemY = PlayerState.currentSystem.get(y);
    int systemZ = PlayerState.currentSystem.get(z);
    system.set(0, systemX);
    system.set(1, systemY);
    system.set(2, systemZ);
    return system;
  }

  public static getSystemX(Player player) {
    int systemX = PlayerState.currentSystem.get(x);
    return systemX;
  }

  public static getSystemY(Player player) {
    int systemY = PlayerState.currentSystem.get(y);
    return systemY;
  }

  public static getSystemZ(Player player) {
    int system = PlayerState.currentSystem.get(z);
    return systemZ;
  }

  public static getFaction(Player player) {

    return faction;
  }

  public static getFactionID(Faction faction) {
    int factionID = faction.factionID;
    return factionID;
  }
}
