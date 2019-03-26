package net.distortsm.api.player;

import net.distortsm.api.server.Server;
import net.distortsm.api.guis.ErrorBox;
import net.distortsm.api.guis.MessageBox;

public class Player {

  public static Server server = new Server();
  public static Player player = new Player();

  public static void sendErrorBox(ErrorBox errorBox) {
    if(server.getPlayer(player) == null) {
      System.out.println(player + " isn't on server! Cannot send ErrorBox");
    } else {
      //figure out how to send errorBox to a player
      System.out.println("Sent ErrorBox to " + player);
    }
  }

  public static void sendMessageBox(MessageBox messageBox) {
    if(server.getPlayer(player) == null) {
      System.out.println(player + " isn't on server! Cannot send MessageBox");
    } else {
      //figure out how to send messageBox to a player
      System.out.println("Sent MessageBox to " + player);
    }
  }
}
