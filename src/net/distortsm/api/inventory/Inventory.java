package net.distortsm.api.inventory;

import org.schema.game.common.controller.elements.cargo.CargoUnit;

public class Inventory extends CargoUnit {
	
	public static String inventoryName;
	public static String inventoryID;
	
	public static void newInventory(String name) {
		
		generateInventoryID();
	}
}
