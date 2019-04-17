package net.distortsm.api.menu;

import org.schema.game.client.controller.GameMainMenuController;
import org.schema.game.client.view.gui.DialogPanel;
import net.distortsm.api.main.Main;
import net.distortsm.api.main.Mod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class ModsDialogPanel extends DialogPanel {
	ArrayList<Mod> mods = Main.mods;
    public ModsDialogPanel(GameMainMenuController controller) {
		super("Mods", controller, 600, 800, mods.modName + "-" + mods.modVersion, "by: " + mods.author);
    }

    @Override
    public final void onDeactivate() {
    }

    @Override
    public final void pressedOK() {
        this.deactivate();
    }
}