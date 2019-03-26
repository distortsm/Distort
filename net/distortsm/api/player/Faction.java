package net.distortsm.api.player;

import org.schema.game.common.data.player.PlayerState;

public class Faction extends PlayerState {

  private static Faction faction = new Faction();
  private static String factionName = PlayerState.getFactionName();
  private static int factionID = PlayerState.getFactionID();
}
