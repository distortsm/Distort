package net.distortsm.api.player;

import java.lang.Object.Vector3i;
import org.schema.game.common.data.player.PlayerState;
import net.distortsm.api.guis.ErrorBox;
import net.distortsm.api.guis.MessageBox;
import net.distortsm.api.entity.Entity;
import net.distortsm.api.player.Faction;

public class Player extends PlayerState {

  public static Server server = new Server();
  public static Player player = new Player();
  private static String name = PlayerState.getName();
  public static Faction faction = Faction.faction;
  public static ArrayList<Integer> sector = new ArrayList<Integer>();
  public static ArrayList<Integer> system = new ArrayList<Integer>();

  private static void sendErrorBox(ErrorBox errorBox) {
    if(server.getPlayer(player) == null) {
      System.out.println(player + " isn't on server! Cannot send ErrorBox");
    } else {
      //figure out how to send errorBox to a player
      System.out.println("Sent ErrorBox to " + player.name);
    }
  }

  private static void sendMessageBox(MessageBox messageBox) {
    if(server.getPlayer(player) == null) {
      System.out.println(player + " isn't on server! Cannot send MessageBox");
    } else {
      //figure out how to send messageBox to a player
      System.out.println("Sent MessageBox to " + player.name);
    }
  }

  public static getCurrentEntity() {
    /** Gets the current entity a player is aligned/attached to */

  }

  public static getSector() {
    /** Gets a player's current sector */
    int sectorX = PlayerState.currentSector.get(x);
    int sectorY = PlayerState.currentSector.get(y);
    int sectorZ = PlayerState.currentSector.get(z);
    sector.set(0, sectorX);
    sector.set(1, sectorY);
    sector.set(2, sectorZ);
    return sector;
  }

  public static getSectorX() {
    int sectorX = PlayerState.currentSector.get(x);
    return sectorX;
  }

  public static getSectorY() {
    int sectorY = PlayerState.currentSector.get(y);
    return sectorY;
  }

  public static getSectorZ() {
    int sectorZ = PlayerState.currentSector.get(z);
    return sectorZ;
  }

  public static getSystem() {
    /** Gets a player's current system */
    int systemX = PlayerState.currentSystem.get(x);
    int systemY = PlayerState.currentSystem.get(y);
    int systemZ = PlayerState.currentSystem.get(z);
    system.set(0, systemX);
    system.set(1, systemY);
    system.set(2, systemZ);
    return system;
  }

  public static getSystemX() {
    int systemX = PlayerState.currentSystem.get(x);
    return systemX;
  }

  public static getSystemY() {
    int systemY = PlayerState.currentSystem.get(y);
    return systemY;
  }

  public static getSystemZ() {
	  int system = PlayerState.currentSystem.get(z);
	  return systemZ;
  }

  public static getFaction() {
	  return faction;
  }
}
