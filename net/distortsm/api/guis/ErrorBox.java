package net.distortsm.api.guis;

import net.distortsm.api.player.Player;

public class ErrorBox {

  public static ErrorBox errorBox = new ErrorBox();
  public static Player player = new Player();

  public static void addText(String text) {
    /** Adds text to a new instance of ErrorBox */
    //Figure out how ErrorBoxes work
    //(Is the text in them just a list or something?)
  }

  public static sendErrorBox(Player p) {
    /** Sends the ErrorBox to player */
    p.sendErrorBox(errorBox);
  }
}
