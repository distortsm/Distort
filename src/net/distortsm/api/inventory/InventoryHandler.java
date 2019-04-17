package net.distortsm.api.inventory;

import java.util.UUID;

import org.schema.game.common.controller.elements.cargo.CargoUnit;

public class InventoryHandler extends Inventory {
	
	public Inventory newInventory(String name) {
		Inventory inventory = new Inventory();
		inventory.inventoryName = name;
		inventory.inventoryUUID = generateInventoryUUID();
		inventory.cargoSpace = 100.0;
		return inventory;
	}
	
	private static UUID generateInventoryUUID() {
		UUID inventoryUUID = UUID.randomUUID();
		return inventoryUUID;
	}
}
