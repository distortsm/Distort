package net.distortsm.api.menu;

import org.schema.game.client.controller.GameMainMenuController;
import org.schema.game.client.view.gui.DialogPanel;
import net.distortsm.api.main.Main;
import net.distortsm.api.main.Mod;
import java.util.HashMap;
import java.util.UUID;

public class ModsDialogPanel extends DialogPanel {
    public ModsDialogPanel(GameMainMenuController controller) {
    	for(Mod mod : Main.mods) {
    		super("Mods", controller, 600, 800, mod.modName + "-" + mod.modVersion, "by: " + mod.author);
    	}
        //super("Mods", controller, 600, 800, "Mod List:", "Spaaaaaccceeeee");
    }

    @Override
    public final void onDeactivate() {
    }

    @Override
    public final void pressedOK() {
        this.deactivate();
    }
}