package net.distortsm.api.guis;

import net.distortsm.api.player.Player;

public class MessageBox {

  public static MessageBox messageBox = new MessageBox();
  public static GUIButton button = new GUIButton();
  public static Player player = new Player();

  public static void addText(String text) {
    /** Adds text to a new instance of MessageBox */
    //Figure out how MessageBoxes work
    //(Is the text in them just a list or something?)

  }

  public static void addButton(GUIButton button, String buttonText) {
    /** Adds a button to a new instance of MessageBox */
    //Figure out how Messageboxes work
    //(How do the buttons works?)

  }

  public static sendMessageBox(Player p) {
    /** Sends the MessageBox to player */
    p.sendMessageBox(messageBox);
  }
}
